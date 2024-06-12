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
public class Product implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idProduct;

    @Column(nullable = false)
    private String productName;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private Integer inStock;
    @Column(nullable = false)
    private Double price;
    @Column(nullable = false)
    private Integer rating;

    @OneToOne (mappedBy = "locationCompany", cascade = CascadeType.ALL)
    private Location location;
    @Column(nullable = false)
    private String paymentMethod;
    @Column (nullable = false)
    @OneToOne (cascade = CascadeType.ALL)
    private Features features;
    private byte[] image;

    @ManyToOne
    @JoinColumn (name = "product_id")
    private Company company;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comments> comments;
}
