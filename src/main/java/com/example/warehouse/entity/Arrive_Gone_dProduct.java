package com.example.warehouse.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Arrive_Gone_dProduct  {
    @Id
    private Long id;
    @OneToOne
    private Product product;
    @Column(nullable = false)
    private Double amount;
    @Column(nullable = false)
    private Double price;
    @Column(nullable = false)
    private Date date;
}
