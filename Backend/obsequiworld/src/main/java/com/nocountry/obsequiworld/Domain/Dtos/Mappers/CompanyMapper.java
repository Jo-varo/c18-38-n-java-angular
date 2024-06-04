package com.nocountry.obsequiworld.Domain.Dtos.Mappers;

import com.nocountry.obsequiworld.Domain.Dtos.Company.CompanyCreateDto;
import com.nocountry.obsequiworld.Domain.Dtos.Company.CompanyReadDto;
import com.nocountry.obsequiworld.Domain.Entities.Company;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CompanyMapper {
    Company createCompanyFromDto(CompanyCreateDto companyCreateDto);
    CompanyReadDto readCompanyFromEntity(Company company);
}
