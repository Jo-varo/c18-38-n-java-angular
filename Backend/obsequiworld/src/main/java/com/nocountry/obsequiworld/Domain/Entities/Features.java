package com.nocountry.obsequiworld.Domain.Entities;

import com.nocountry.obsequiworld.Domain.Entities.Enums.Category;
import com.nocountry.obsequiworld.Domain.Entities.Enums.Size;
import com.nocountry.obsequiworld.Domain.Entities.Enums.Tag;
import com.nocountry.obsequiworld.Domain.Entities.Enums.Target;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Features implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idFeature;

    @Column (nullable = false)
    private String content;
    @Column (nullable = false)
    private Size size;
    @Column (nullable = false)
    private Tag tag;
    @Column (nullable = false)
    private Category category;
    @Column (nullable = false)
    private Target target;
}
