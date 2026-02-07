package com.aruna.wcms.Helper.controller;

import com.aruna.wcms.Helper.model.Helper;
import com.aruna.wcms.Helper.service.HelperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

@RequestMapping(path="/api/helper")
public class HelperController {

    @Autowired
    private HelperService helperService;

    @PostMapping(path="/create-helper")
    public @ResponseBody Helper createHelper(Helper helper) {
        return helperService.creatHelper(helper);
    }

    @PostMapping(path="/update-helper")
    public @ResponseBody Helper updateHelper(Helper helper) {
        return helperService.updateHelper(helper);
    }

    @PostMapping(path = "/read-helper")
    public @ResponseBody Helper readHelper(Helper helper) {
        return helperService.readHelper(helper);
    }

    @PostMapping(path = "/delete-helper")
    public @ResponseBody Helper deleteHelper(Helper helper) {
        return helperService.deleteHelper(helper);
    }
}
