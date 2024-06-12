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
public class Comments implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idComment;
    private String commentBody;
    private Long rate;
    private String userName;

    @ManyToOne
    @JoinColumn (name = "comment_id")
    private Product product;
}
