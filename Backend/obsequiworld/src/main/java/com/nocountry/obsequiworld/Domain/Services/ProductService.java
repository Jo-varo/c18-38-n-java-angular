package com.nocountry.obsequiworld.Domain.Services;


import com.nocountry.obsequiworld.Domain.Dtos.Product.ProductCreateDto;
import org.springframework.stereotype.Component;

@Component
public interface ProductService {
    public void createProduct (ProductCreateDto productCreateDto);
}
