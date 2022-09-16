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

@Table(name = "users")
public class User  {
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false,unique = true)
    private String phoneNumber;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userNumber;

    @Column(nullable = false)
    private String password;

    @ManyToOne
    private Warehouse warehouse;

    @Column(nullable = false)
    private Boolean status;

    public User(String name, String firstName, String phoneNumber,  String password, Warehouse warehouse, Boolean status) {
        this.name = name;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.warehouse = warehouse;
        this.status = status;
    }
}
