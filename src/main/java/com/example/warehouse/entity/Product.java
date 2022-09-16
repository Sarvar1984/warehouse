package com.example.warehouse.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Product  {
   @Column(nullable = false)
   private String name;

    @ManyToOne
    private Category category;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer productNumber;
    @ManyToOne
    private Unit unit;

}
