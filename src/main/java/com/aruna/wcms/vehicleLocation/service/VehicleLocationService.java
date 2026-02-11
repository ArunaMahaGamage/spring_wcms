package com.aruna.wcms.vehicleLocation.service;

import com.aruna.wcms.vehicleLocation.model.VehicleLocation;

public interface VehicleLocationService {
    VehicleLocation createVehicleLocation(VehicleLocation vehicleLocation);

    VehicleLocation updateVehicleLocation(VehicleLocation vehicleLocation);

    VehicleLocation readVehicleLocation(VehicleLocation vehicleLocation);

    VehicleLocation deleteVehicleLocation(VehicleLocation vehicleLocation);
}
