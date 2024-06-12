package com.nocountry.obsequiworld.Infrastructure.Controllers;

import com.nocountry.obsequiworld.Application.Implementations.ProductImplementation;
import com.nocountry.obsequiworld.Domain.Dtos.Mappers.GeneralMapper;
import com.nocountry.obsequiworld.Domain.Dtos.Product.ProductCreateDto;
import com.nocountry.obsequiworld.Domain.Dtos.Product.ProductReadDto;
import com.nocountry.obsequiworld.Domain.Entities.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductsController {

    private final ProductImplementation productImplementation;
    private final GeneralMapper<Product, ProductCreateDto, ProductReadDto> mapper;

    @PostMapping("/create-product")
    public ResponseEntity<ProductCreateDto> createProduct(@Validated
                                                              @RequestBody ProductCreateDto productCreateDto){
        try{
            productImplementation.createEntity(productCreateDto);
            return new ResponseEntity<>(productCreateDto, HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(productCreateDto, HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @GetMapping("/product-list")
    public ResponseEntity<List<ProductReadDto>> productList(){
        try{
            return new ResponseEntity<>(productImplementation.getEntitiesList(), HttpStatus.FOUND);
        }catch (Exception e){
            return new ResponseEntity<>(productImplementation.getEntitiesList(), HttpStatus.NOT_FOUND);
        }
    }
}
