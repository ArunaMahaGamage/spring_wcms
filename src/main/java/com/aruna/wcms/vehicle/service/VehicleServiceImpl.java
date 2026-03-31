package com.aruna.wcms.vehicle.service;

import com.aruna.wcms.manageTeam.model.ManageTeam;
import com.aruna.wcms.submitComplain.model.Complain;
import com.aruna.wcms.vehicle.model.Vehicle;
import com.aruna.wcms.vehicle.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
    public Iterable<Vehicle> readAllVehicle() {
        Iterable<Vehicle> vehicleResult = vehicleRepository.findAll();
        if (vehicleResult.iterator().hasNext()) {
            return vehicleResult;
        } else {
            // Or throw an exception, return null, etc.
            throw new RuntimeException("Complain is not found.");
        }
    }

    @Override
    public Vehicle readVehicle(Vehicle vehicle) {
        Optional<Vehicle> requestNewBinResult = vehicleRepository.findByVehicleId(vehicle.getVehicleId());

        // Handle the Optional result
        if (requestNewBinResult.isPresent()) {
            return requestNewBinResult.get();
        } else {
            // Or throw an exception, return null, etc.
            throw new RuntimeException("Vehicle not found for id :: " + vehicle.getVehicleId());
        }
    }

    @Override
    public Vehicle deleteVehicle(Vehicle vehicle) {
        return vehicle;
    }
}
