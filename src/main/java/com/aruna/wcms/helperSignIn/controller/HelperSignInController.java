package com.aruna.wcms.helperSignIn.controller;

import com.aruna.wcms.helperSignIn.model.HelperSignIn;
import com.aruna.wcms.helperSignIn.service.HelperSignInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

@RequestMapping(path="/api/helper-sign-in")
public class HelperSignInController {

    @Autowired
    HelperSignInService helperSignInService;

    @PostMapping(path="/create")
    public @ResponseBody HelperSignIn creatHelperSignIn(@RequestBody HelperSignIn helperSignIn) {
        return helperSignInService.creatHelperSignIn(helperSignIn);
    }

    @PostMapping(path="/read")
    public @ResponseBody HelperSignIn readHelperSignIn(@RequestBody HelperSignIn helper) {
        return helperSignInService.readHelperSignIn(helper);
    }

    @PostMapping(path="/update")
    public @ResponseBody HelperSignIn updateHelperSignIn(@RequestBody HelperSignIn helper) {
        return helperSignInService.updateHelperSignIn(helper);
    }

    @PostMapping(path="/delete")
    public @ResponseBody HelperSignIn deleteHelperSignIn(@RequestBody HelperSignIn helper) {
        return helperSignInService.deleteHelperSignIn(helper);
    }
}
