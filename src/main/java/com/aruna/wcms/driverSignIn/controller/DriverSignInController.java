package com.aruna.wcms.driverSignIn.controller;

import com.aruna.wcms.driverSignIn.model.DriverSignIn;
import com.aruna.wcms.driverSignIn.service.DriverSignInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

@RequestMapping(path="/api/driver-sign-in")
public class DriverSignInController {

    @Autowired
    DriverSignInService driverSignInService;

    public @ResponseBody DriverSignIn createDriverSignIn(@RequestBody DriverSignIn driverSignIn) {
        return null;
    }


    public @ResponseBody DriverSignIn readDriverSignIn(@RequestBody DriverSignIn driverSignIn) {
        return null;
    }


    public @ResponseBody DriverSignIn updateDriverSignIn(@RequestBody DriverSignIn driverSignIn) {
        return null;
    }


    public @ResponseBody DriverSignIn deleteDriverSignIn(@RequestBody DriverSignIn driverSignIn) {
        return null;
    }
}
