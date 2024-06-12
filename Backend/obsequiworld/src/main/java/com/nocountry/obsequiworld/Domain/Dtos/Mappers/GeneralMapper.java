package com.nocountry.obsequiworld.Domain.Dtos.Mappers;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper (componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface GeneralMapper <Entity, EntityCreateDto, EntityReadDto>{
    Entity createFromDto(EntityCreateDto dto);
    EntityReadDto readFromEntity(Entity entity);
}
