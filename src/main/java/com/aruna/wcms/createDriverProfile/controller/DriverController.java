package com.aruna.wcms.createDriverProfile.controller;

import com.aruna.wcms.createDriverProfile.model.Driver;
import com.aruna.wcms.createDriverProfile.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

@RequestMapping(path="/api/driver")
public class DriverController {

    @Autowired
    private DriverService driverService;

    @PostMapping(path="/addDriver")
    public @ResponseBody Driver addDriver (@RequestBody Driver driver) {

        return driverService.addDriver(driver);
    }

    @PostMapping(path="/updateDriver")
    public @ResponseBody Driver updateDriver (@RequestBody Driver driver) {

        return driverService.updateDriver(driver);
    }

    @PostMapping(path="/readDriver")
    public @ResponseBody Driver readDriver (@RequestBody Driver driver) {

        return driverService.readDriver(driver);
    }

    @PostMapping(path="/deleteDriver")
    public @ResponseBody Driver deleteDriver (@RequestBody Driver driver) {

        return driverService.deleteDriver(driver);
    }
}
