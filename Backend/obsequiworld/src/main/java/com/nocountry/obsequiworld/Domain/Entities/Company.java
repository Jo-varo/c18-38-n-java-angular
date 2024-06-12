package com.nocountry.obsequiworld.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Company implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCompany;
    @Column (nullable = false)
    private String companyName;
    @Column (nullable = false)
    private String description;
    private Integer rating;

    private byte[] image;
    @OneToOne (cascade = CascadeType.ALL)
    private Contact contact;
    @OneToOne
    private Location locationCompany;
    @OneToMany (mappedBy = "company", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Product> products;
    private String paymentMethod;
}
