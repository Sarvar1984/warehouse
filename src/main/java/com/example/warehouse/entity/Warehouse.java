package com.example.warehouse.entity;


import com.example.warehouse.entity.template.AbcEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data

@NoArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
public class Warehouse extends AbcEntity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Boolean status;



    public Warehouse(String name, Boolean status) {
        this.name = name;
        this.status = status;
    }
}
