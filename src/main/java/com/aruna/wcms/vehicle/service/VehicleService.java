package com.aruna.wcms.vehicle.service;

import com.aruna.wcms.vehicle.model.Vehicle;

public interface VehicleService {
    Vehicle addVehicle(Vehicle vehicle);

    Vehicle updateVehicle(Vehicle vehicle);

    Vehicle readVehicle(Vehicle vehicle);

    Vehicle deleteVehicle(Vehicle vehicle);
}
