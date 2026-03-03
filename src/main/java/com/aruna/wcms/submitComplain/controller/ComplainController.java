package com.aruna.wcms.submitComplain.controller;

import com.aruna.wcms.submitComplain.model.Complain;
import com.aruna.wcms.submitComplain.service.ComplainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

@RequestMapping(path="/api/complain")
public class ComplainController {

    @Autowired
    private ComplainService complainService;

    @PostMapping(path="/create-complain")
    public @ResponseBody Complain createComplain(@RequestBody Complain complain) {
        return complainService.createComplain(complain);
    }

    @PostMapping(path="/read-complain")
    public @ResponseBody Complain readComplain(@RequestBody Complain complain) {
        return complainService.readComplain(complain);
    }

    @PostMapping(path="/update-complain")
    public @ResponseBody Complain updateComplain(@RequestBody Complain complain) {
        return complainService.updateComplain(complain);
    }

    @PostMapping(path="/delete-complain")
    public @ResponseBody Complain deleteComplain(@RequestBody Complain complain) {
        return complainService.deleteComplain(complain);
    }
}
