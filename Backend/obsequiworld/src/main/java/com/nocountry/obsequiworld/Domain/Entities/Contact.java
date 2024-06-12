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
public class Contact implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idContact;

    @Column (nullable = false)
    private String phone;
    private String instagram;
    private String facebook;
    private String webPage;
}
