package com.nocountry.obsequiworld.Domain.Dtos.Mappers;

import com.nocountry.obsequiworld.Domain.Dtos.Product.ProductCreateDto;
import com.nocountry.obsequiworld.Domain.Dtos.Product.ProductReadDto;
import com.nocountry.obsequiworld.Domain.Entities.Product;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ProductMapper {
    Product createProductFromDto(ProductCreateDto productCreateDto);
    ProductReadDto readProductFromEntity(Product product);
}
