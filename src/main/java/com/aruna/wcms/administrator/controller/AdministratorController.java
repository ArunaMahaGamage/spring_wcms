package com.aruna.wcms.administrator.controller;

import com.aruna.wcms.administrator.model.Administrator;
import com.aruna.wcms.administrator.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

@RequestMapping(path="/api/administrator")
public class AdministratorController {

    @Autowired
    AdministratorService administratorService;

    @PostMapping(path="/create-administrator")
    public @ResponseBody Administrator createAdministrator(Administrator administrator) {
        return administratorService.createAdministrator(administrator);
    }

    @PostMapping(path="/update-administrator")
    public @ResponseBody Administrator updateAdministrator(Administrator administrator) {
        return administratorService.updateAdministrator(administrator);
    }

    @PostMapping(path="/read-administrator")
    public @ResponseBody Administrator readAdministrator(Administrator administrator) {
        return administratorService.readAdministrator(administrator);
    }

    @PostMapping(path="/delete-administrator")
    public @ResponseBody Administrator deleteAdministrator(Administrator administrator) {
        return administratorService.deleteAdministrator(administrator);
    }
}
