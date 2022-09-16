package com.example.warehouse.entity;

import com.example.warehouse.entity.template.AbcEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
public class Supplier extends AbcEntity {
    @Column(nullable = false)
    private String name;

    @Column(nullable = false,unique = true)
    public String phoneNumber;
}
