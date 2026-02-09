package com.aruna.wcms.citizen.controller;

import com.aruna.wcms.citizen.model.Citizen;
import com.aruna.wcms.citizen.service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

@RequestMapping(path="/api/citizen")
public class CitizenController {

    @Autowired
    private CitizenService citizenService;

    @PostMapping(path="/create-citizen")
    public @ResponseBody Citizen createCitizen(Citizen citizen) {
        return citizenService.createCitizen(citizen);
    }

    @PostMapping(path="/read-citizen")
    public @ResponseBody Citizen readCitizen(Citizen citizen) {
        return citizenService.readCitizen(citizen);
    }

    @PostMapping(path="/update-citizen")
    public @ResponseBody Citizen updateCitizen(Citizen citizen) {
        return citizenService.updateCitizen(citizen);
    }

    @PostMapping(path="/delete-citizen")
    public @ResponseBody Citizen deleteCitizen(Citizen citizen) {
        return citizenService.deleteCitizen(citizen);
    }
}
