package com.aruna.wcms.administratorSignIn.controller;

import com.aruna.wcms.administratorSignIn.model.AdministratorSignIn;
import com.aruna.wcms.administratorSignIn.service.AdministratorSignInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

@RequestMapping(path="/api/administrator-sign-in")
public class AdministratorSignInController {

    @Autowired
    AdministratorSignInService administratorSignInService;

    @PostMapping(path="/create-administrator-sign-in")
    public @ResponseBody AdministratorSignIn createAdministratorSignIn(@RequestBody AdministratorSignIn administratorSignIn) {
        return administratorSignInService.createAdministratorSignIn(administratorSignIn);
    }

    @PostMapping(path="/read-administrator-sign-in")
    public @ResponseBody AdministratorSignIn readAdministratorSignIn(@RequestBody AdministratorSignIn administratorSignIn) {
        return administratorSignInService.readAdministratorSignIn(administratorSignIn);
    }

    @PostMapping(path="/update-administrator-sign-in")
    public @ResponseBody AdministratorSignIn updateAdministratorSignIn(@RequestBody AdministratorSignIn administratorSignIn) {
        return administratorSignInService.updateAdministratorSignIn(administratorSignIn);
    }

    @PostMapping(path="/delete-administrator-sign-in")
    public @ResponseBody AdministratorSignIn deleteAdministratorSignIn(@RequestBody AdministratorSignIn administratorSignIn) {
        return administratorSignInService.deleteAdministratorSignIn(administratorSignIn);
    }
}
