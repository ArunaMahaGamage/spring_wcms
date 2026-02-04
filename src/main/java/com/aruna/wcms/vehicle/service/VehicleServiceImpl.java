package com.aruna.wcms.vehicle.service;

import com.aruna.wcms.vehicle.model.Vehicle;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl implements VehicleService {
    @Override
    public Vehicle addVehicle(Vehicle vehicle) {
        return vehicle;
    }

    @Override
    public Vehicle updateVehicle(Vehicle vehicle) {
        return vehicle;
    }

    @Override
    public Vehicle readVehicle(Vehicle vehicle) {
        return vehicle;
    }

    @Override
    public Vehicle deleteVehicle(Vehicle vehicle) {
        return vehicle;
    }
}
