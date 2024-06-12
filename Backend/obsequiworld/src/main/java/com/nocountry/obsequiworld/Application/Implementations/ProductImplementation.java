package com.nocountry.obsequiworld.Application.Implementations;

import com.nocountry.obsequiworld.Domain.Dtos.Mappers.GeneralMapper;
import com.nocountry.obsequiworld.Domain.Dtos.Product.ProductCreateDto;
import com.nocountry.obsequiworld.Domain.Dtos.Product.ProductReadDto;
import com.nocountry.obsequiworld.Domain.Entities.Product;
import com.nocountry.obsequiworld.Domain.Repositories.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductImplementation extends CrudImplementation
        <Product, Long, ProductCreateDto, ProductReadDto>  {

    public ProductImplementation(CrudRepository<Product, Long> crudRepository, GeneralMapper<Product, ProductCreateDto, ProductReadDto> mapper) {
        super(crudRepository, mapper);
    }

    @Transactional
    @Override
    public void createEntity(ProductCreateDto productCreateDto) throws Exception {
        super.createEntity(productCreateDto);
    }

    @Override
    public List<ProductReadDto> getEntitiesList() {
        return super.getEntitiesList();
    }

    @Transactional
    @Override
    public void deleteEntity(Long aLong) throws Exception {
        super.verifyIfEntityExist(aLong);
        super.deleteEntity(aLong);
    }
}
