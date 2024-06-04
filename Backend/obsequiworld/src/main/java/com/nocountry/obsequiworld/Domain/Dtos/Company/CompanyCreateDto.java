package com.nocountry.obsequiworld.Domain.Dtos.Company;

import lombok.With;
import org.antlr.v4.runtime.misc.NotNull;

@With
public record CompanyCreateDto(
        @NotNull
        String companyName,

        @NotNull
        String email) {
}
