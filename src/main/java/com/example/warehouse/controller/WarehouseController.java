package com.example.warehouse.controller;

import com.example.warehouse.dto.WarehouseDto;
import com.example.warehouse.entity.Warehouse;
import com.example.warehouse.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/warehouse")
public class WarehouseController {
    private final WarehouseService warehouseService;


    public WarehouseController(WarehouseService warehouseService) {
        this.warehouseService = warehouseService;
    }
    @PostMapping
    public Warehouse save(@RequestBody WarehouseDto warehouseDto){
        return warehouseService.save(warehouseDto);
    }
}
