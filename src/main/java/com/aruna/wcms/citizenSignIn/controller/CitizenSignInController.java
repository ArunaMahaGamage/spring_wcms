package com.aruna.wcms.citizenSignIn.controller;

import com.aruna.wcms.citizenSignIn.model.CitizenSignIn;
import com.aruna.wcms.citizenSignIn.service.CitizenSignInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

@RequestMapping(path="/api/citizen-sign-in")
public class CitizenSignInController {

    @Autowired
    CitizenSignInService citizenSignInService;

    @PostMapping(path="/create-citizen-sign-in")
    public @ResponseBody CitizenSignIn createCitizen(CitizenSignIn citizenSignIn) {
        return citizenSignInService.createCitizen(citizenSignIn);
    }

    @PostMapping(path="/read-citizen-sign-in")
    public @ResponseBody CitizenSignIn readCitizen(CitizenSignIn citizenSignIn) {
        return citizenSignInService.readCitizen(citizenSignIn);
    }

    @PostMapping(path="/update-citizen-sign-in")
    public @ResponseBody CitizenSignIn updateCitizen(CitizenSignIn citizenSignIn) {
        return citizenSignInService.updateCitizen(citizenSignIn);
    }

    @PostMapping(path="/delete-citizen-sign-in")
    public @ResponseBody CitizenSignIn deleteCitizen(CitizenSignIn citizenSignIn) {
        return citizenSignInService.deleteCitizen(citizenSignIn);
    }
}
