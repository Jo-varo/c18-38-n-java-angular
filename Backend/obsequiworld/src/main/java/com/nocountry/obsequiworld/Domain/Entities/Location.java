package com.nocountry.obsequiworld.Domain.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Location implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long locationId;

    @Column (nullable = false)
    private String country;
    @Column (nullable = false)
    private String city;
    @Column (nullable = false)
    private String address;
}
