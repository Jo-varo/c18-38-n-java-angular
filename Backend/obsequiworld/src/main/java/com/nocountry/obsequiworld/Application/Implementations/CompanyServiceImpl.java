package com.nocountry.obsequiworld.Application.Implementations;

import com.nocountry.obsequiworld.Domain.Dtos.Company.CompanyCreateDto;
import com.nocountry.obsequiworld.Domain.Dtos.Company.CompanyReadDto;
import com.nocountry.obsequiworld.Domain.Dtos.Mappers.GeneralMapper;
import com.nocountry.obsequiworld.Domain.Entities.Company;
import com.nocountry.obsequiworld.Domain.Repositories.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CompanyServiceImpl extends CrudImplementation
        <Company, Long, CompanyCreateDto, CompanyReadDto>{

    public CompanyServiceImpl(CrudRepository<Company, Long> crudRepository, GeneralMapper<Company, CompanyCreateDto, CompanyReadDto> mapper) {
        super(crudRepository, mapper);
    }

    @Override
    @Transactional
    public void createEntity(CompanyCreateDto companyCreateDto) throws Exception {
        super.createEntity(companyCreateDto);
    }

    @Override
    public List<CompanyReadDto> getEntitiesList() {
        return super.getEntitiesList();
    }

    @Transactional
    @Override
    public void deleteEntity(Long Long) throws Exception {
        super.verifyIfEntityExist(Long);
        super.deleteEntity(Long);
    }
}
