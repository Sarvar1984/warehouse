package com.example.warehouse.dto;

import com.example.warehouse.entity.Arrive_Gone_dProduct;
import com.example.warehouse.entity.Currency;
import com.example.warehouse.entity.Supplier;
import com.example.warehouse.entity.Warehouse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WarehouseIn_OutDto {

    private Date date;

    @OneToOne
    private Warehouse warehouse;

    @OneToOne
    private Currency typeCurrency;


    private String factureNumber;



    @OneToOne
    private Supplier supplier;

    @OneToMany
    Set<Arrive_Gone_dProduct> arrivedProduct=new HashSet<>();
}
