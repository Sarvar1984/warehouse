package com.example.warehouse.entity;

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
@Entity


public class WarehouseIn_Out  {

    @Column(nullable = false)
    private Date date;

    @OneToOne
    private Warehouse warehouse;

    @OneToOne
    private Currency typeCurrency;

    @Column(nullable = false)
    private String factureNumber;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String receiptNumber;

    @OneToOne
    private Supplier supplier;

   @OneToMany
   Set<Arrive_Gone_dProduct> arrivedProduct=new HashSet<>();

}
