package com.aruna.wcms.manageTeam.controller;

import com.aruna.wcms.manageTeam.model.ManageTeam;
import com.aruna.wcms.manageTeam.service.ManageTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

@RequestMapping(path="/api/manage-team")
public class ManageTeamController {

    @Autowired
    ManageTeamService manageTeamService;

    @PostMapping(path="/create")
    public @ResponseBody ManageTeam createManageTeam(@RequestBody ManageTeam manageTeam) {
        return manageTeamService.createManageTeam(manageTeam);
    }

    @PostMapping(path="/read")
    public @ResponseBody ManageTeam readManageTeam(@RequestBody ManageTeam manageTeam) {
        return manageTeamService.readManageTeam(manageTeam);
    }

    @PostMapping(path="/update")
    public @ResponseBody ManageTeam updateManageTeam(@RequestBody ManageTeam manageTeam) {
        return manageTeamService.updateManageTeam(manageTeam);
    }

    @PostMapping(path="/delete")
    public @ResponseBody ManageTeam deleteManageTeam(@RequestBody ManageTeam manageTeam) {
        return manageTeamService.deleteManageTeam(manageTeam);
    }
}
