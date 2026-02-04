package com.aruna.wcms.vehicle.controller;

import com.aruna.wcms.vehicle.model.Vehicle;
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

    @GetMapping("/")
    public @ResponseBody Map home() {

        Map map = new HashMap();
        map.put("status", "Welcome to the Vehicle API!");
        return map;
        //return "Welcome to the Vehicle API!";
    }

    @PostMapping(path="/addVehicle")
    public @ResponseBody Vehicle addVehicles (@RequestBody Vehicle vehicle) {

        return vehicle;
    }

    @PostMapping(path="/updateVehicle")
    public @ResponseBody Vehicle updateVehicles (@RequestBody Vehicle vehicle) {

        return vehicle;
    }

    @PostMapping(path="/readVehicle")
    public @ResponseBody Vehicle readVehicles (@RequestBody Vehicle vehicle) {

        return vehicle;
    }

    @PostMapping(path="/deleteVehicle")
    public @ResponseBody Vehicle deleteVehicles (@RequestBody Vehicle vehicle) {

        return vehicle;
    }
}
