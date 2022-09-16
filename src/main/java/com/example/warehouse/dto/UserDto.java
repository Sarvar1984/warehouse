package com.example.warehouse.dto;

import com.example.warehouse.entity.Warehouse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private String name;


    private String firstName;


    private String phoneNumber;


    private String password;


    private Warehouse warehouse;


    private Boolean status;
}
