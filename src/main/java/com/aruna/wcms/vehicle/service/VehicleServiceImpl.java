package com.aruna.wcms.vehicle.service;

import com.aruna.wcms.vehicle.model.Vehicle;
import com.aruna.wcms.vehicle.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public Vehicle addVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
        //return vehicle;
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
