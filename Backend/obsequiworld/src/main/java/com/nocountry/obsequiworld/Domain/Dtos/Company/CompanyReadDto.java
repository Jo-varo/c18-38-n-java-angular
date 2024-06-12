package com.nocountry.obsequiworld.Domain.Dtos.Company;

import com.nocountry.obsequiworld.Domain.Entities.Contact;
import com.nocountry.obsequiworld.Domain.Entities.Location;
import com.nocountry.obsequiworld.Domain.Entities.Product;
import jakarta.persistence.*;
import org.springframework.validation.annotation.Validated;

import java.util.List;

public record CompanyReadDto(
        @Validated
        Long idCompany,
        @Validated
        String companyName,
        @Validated
        String description,
        @Validated
        Integer rating,
        @Validated
        byte[] image,
        @Validated
        Contact contact,
        @Validated
        List<Product> productList,
        @Validated
        Location locationCompany
) {
}
