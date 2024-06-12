package com.nocountry.obsequiworld.Application.Implementations;

import com.nocountry.obsequiworld.Domain.Dtos.Mappers.GeneralMapper;
import com.nocountry.obsequiworld.Domain.Repositories.CrudRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public abstract class CrudImplementation
        <Entity, IdEntity, EntityCreateDto, EntityReadDto> {

    protected final CrudRepository<Entity, IdEntity> crudRepository;
    protected final GeneralMapper<Entity, EntityCreateDto, EntityReadDto> mapper;

    public void createEntity(EntityCreateDto dto) throws Exception {
        Optional.ofNullable(dto).orElseThrow(() -> new NullPointerException("Dto vacío"));
        crudRepository.save(mapper.createFromDto(dto));
    }

    public List<EntityReadDto> getEntitiesList() {
        List<Entity> readDtos = crudRepository.findAll();
        return readDtos.stream().map(mapper::readFromEntity).collect(Collectors.toList());
    }

    public void deleteEntity(IdEntity id) throws Exception{
        Optional<Entity> optional = crudRepository.findById(id);
        optional.ifPresent(action -> crudRepository.deleteById(id));
    }

    protected void verifyIfEntityExist(IdEntity id) throws Exception{
        Optional<Entity> optional = crudRepository.findById(id);
        if(optional.isPresent()){
            throw new Exception("Entidad ya existe");
        }
    }
}
