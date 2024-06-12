package com.nocountry.obsequiworld.Domain.Dtos.Comments;

import com.nocountry.obsequiworld.Domain.Entities.Product;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.With;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.validation.annotation.Validated;

@With
public record CommentsCreateDto(
        @Validated
        String commentBody,
        @Validated
        Long rate,
        @Validated
        String userName,
        @Validated
        Product product
) {
}
