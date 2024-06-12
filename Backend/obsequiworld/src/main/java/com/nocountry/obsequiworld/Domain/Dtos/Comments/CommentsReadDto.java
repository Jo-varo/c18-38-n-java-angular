package com.nocountry.obsequiworld.Domain.Dtos.Comments;

import com.nocountry.obsequiworld.Domain.Entities.Product;
import org.springframework.validation.annotation.Validated;

public record CommentsReadDto(
        @Validated
        Long commentId,
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
