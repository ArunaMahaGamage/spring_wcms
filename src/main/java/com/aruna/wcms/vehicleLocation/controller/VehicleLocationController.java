package com.aruna.wcms.vehicleLocation.controller;

import com.aruna.wcms.vehicleLocation.model.VehicleLocation;
import com.aruna.wcms.vehicleLocation.service.VehicleLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

// This means URL's start with /api (after Application path)
@RequestMapping(path="/api/vehicle-location")
public class VehicleLocationController {

    @Autowired
    VehicleLocationService vehicleLocationService;

    @PostMapping(path="/create-location")
    public VehicleLocation addVehicleLocation(VehicleLocation vehicleLocation) {
        return vehicleLocationService.createVehicleLocation(vehicleLocation);
    }

    @PostMapping(path="/update-location")
    public VehicleLocation updateVehicleLocation(VehicleLocation vehicleLocation) {
        return vehicleLocationService.updateVehicleLocation(vehicleLocation);
    }

    @PostMapping(path="/read-location")
    public VehicleLocation readVehicleLocation(VehicleLocation vehicleLocation) {
        return vehicleLocationService.readVehicleLocation(vehicleLocation);
    }

    @PostMapping(path="/delete-location")
    public VehicleLocation deleteVehicleLocation(VehicleLocation vehicleLocation) {
        return vehicleLocationService.deleteVehicleLocation(vehicleLocation);
    }
}
