package com.nocountry.obsequiworld.Domain.Dtos.Company;

import com.nocountry.obsequiworld.Domain.Entities.Contact;
import com.nocountry.obsequiworld.Domain.Entities.Location;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToOne;
import lombok.With;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.validation.annotation.Validated;

@With
public record CompanyCreateDto(
        @Validated @NotNull
        String companyName,
        @Validated @NotNull
        String description,
        @Validated @NotNull
        Contact contact,
        @Validated @NotNull
        Location locationCompany,
        @Validated @NotNull
        String paymentMethod) {
}
