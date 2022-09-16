package com.example.warehouse.service;

import com.example.warehouse.dto.WarehouseDto;
import com.example.warehouse.entity.Warehouse;

public interface WarehouseService {
    Warehouse save(WarehouseDto warehouseDto);
}
