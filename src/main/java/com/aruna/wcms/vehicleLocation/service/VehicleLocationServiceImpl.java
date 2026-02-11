package com.aruna.wcms.vehicleLocation.service;

import com.aruna.wcms.vehicleLocation.model.VehicleLocation;
import com.aruna.wcms.vehicleLocation.repository.VehicleLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleLocationServiceImpl implements VehicleLocationService {

    @Autowired
    VehicleLocationRepository vehicleLocationRepository;

    @Override
    public VehicleLocation createVehicleLocation(VehicleLocation vehicleLocation) {
        return null;
    }

    @Override
    public VehicleLocation updateVehicleLocation(VehicleLocation vehicleLocation) {
        return null;
    }

    @Override
    public VehicleLocation readVehicleLocation(VehicleLocation vehicleLocation) {
        return null;
    }

    @Override
    public VehicleLocation deleteVehicleLocation(VehicleLocation vehicleLocation) {
        return null;
    }
}
