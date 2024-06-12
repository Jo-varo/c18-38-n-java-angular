package com.nocountry.obsequiworld.Domain.Dtos.Product;

import com.nocountry.obsequiworld.Domain.Entities.Comments;
import com.nocountry.obsequiworld.Domain.Entities.Company;
import com.nocountry.obsequiworld.Domain.Entities.Features;
import com.nocountry.obsequiworld.Domain.Entities.Location;
import lombok.With;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@With
public record ProductReadDto(
        @Validated
        Long productId,
        @Validated @NotNull
        String productName,
        @Validated @NotNull
        String description,
        @Validated @NotNull
        Integer inStock,
        @Validated @NotNull
        Double price,
        @Validated @NotNull
        Integer rating,
        @Validated @NotNull
        Location location,
        @Validated @NotNull
        String paymentMethod,
        @Validated @NotNull
        Features features,
        @Validated @NotNull
        Company company,
        @Validated
        List<Comments> commentsList,
        byte[] image
) {

}
