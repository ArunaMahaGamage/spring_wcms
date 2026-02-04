package com.aruna.wcms.vehicle.controller;

import com.aruna.wcms.vehicle.model.Vehicle;
import com.aruna.wcms.vehicle.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

// This means that this
// class is a Controller
//@RestController
@Controller

// This means URL's start with /api (after Application path)
@RequestMapping(path="/api/vehicle")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping("/")
    public @ResponseBody Map home() {

        Map map = new HashMap();
        map.put("status", "Welcome to the Vehicle API!");
        return map;
        //return "Welcome to the Vehicle API!";
    }

    @PostMapping(path="/addVehicle")
    public @ResponseBody Vehicle addVehicle (@RequestBody Vehicle vehicle) {

        return vehicleService.addVehicle(vehicle);
    }

    @PostMapping(path="/updateVehicle")
    public @ResponseBody Vehicle updateVehicle (@RequestBody Vehicle vehicle) {

        return vehicleService.updateVehicle(vehicle);
    }

    @PostMapping(path="/readVehicle")
    public @ResponseBody Vehicle readVehicle (@RequestBody Vehicle vehicle) {

        return vehicleService.readVehicle(vehicle);
    }

    @PostMapping(path="/deleteVehicle")
    public @ResponseBody Vehicle deleteVehicle (@RequestBody Vehicle vehicle) {

        return vehicleService.deleteVehicle(vehicle);
    }
}
