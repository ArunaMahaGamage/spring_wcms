package com.aruna.wcms.administratorSignIn.controller;

import com.aruna.wcms.administratorSignIn.model.AdministratorSignIn;
import com.aruna.wcms.administratorSignIn.service.AdministratorSignInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

@RequestMapping(path="/api/administrator-sign-in")
public class AdministratorSignInController {

    @Autowired
    AdministratorSignInService administratorSignInService;

    @PostMapping(path="/create-administrator-sign-in")
    public @ResponseBody AdministratorSignIn createCitizen(AdministratorSignIn administratorSignIn) {
        return null;
    }

    @PostMapping(path="/read-administrator-sign-in")
    public @ResponseBody AdministratorSignIn readCitizen(AdministratorSignIn administratorSignIn) {
        return null;
    }

    @PostMapping(path="/update-administrator-sign-in")
    public @ResponseBody AdministratorSignIn updateCitizen(AdministratorSignIn administratorSignIn) {
        return null;
    }

    @PostMapping(path="/delete-administrator-sign-in")
    public @ResponseBody AdministratorSignIn deleteCitizen(AdministratorSignIn administratorSignIn) {
        return null;
    }
}
