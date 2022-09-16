package com.example.warehouse.service.impl;

import com.example.warehouse.dto.WarehouseDto;
import com.example.warehouse.entity.Warehouse;
import com.example.warehouse.repository.WarehouseRepository;
import com.example.warehouse.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.WatchService;

@Service
public class WarehouseServiceImpl implements WarehouseService {
    @Autowired
    private WarehouseRepository warehouseRepository;

    @Override
    public Warehouse save(WarehouseDto warehouseDto) {
        Warehouse warehouse=new Warehouse(
                warehouseDto.getName(),
                warehouseDto.getStatus()
        );
        return warehouseRepository.save(warehouse);

    }
}
