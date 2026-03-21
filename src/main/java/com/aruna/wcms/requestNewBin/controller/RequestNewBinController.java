package com.aruna.wcms.requestNewBin.controller;

import com.aruna.wcms.requestNewBin.model.RequestNewBin;
import com.aruna.wcms.requestNewBin.service.RequestNewBinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

@RequestMapping(path="/api/request-new-bin")
public class RequestNewBinController {

    @Autowired
    RequestNewBinService requestNewBinService;

    @PostMapping(path="/create")
    public @ResponseBody RequestNewBin createRequestNewBin(@RequestBody RequestNewBin requestNewBin) {
        return requestNewBinService.createRequestNewBin(requestNewBin);
    }

    @PostMapping(path="/read")
    public @ResponseBody RequestNewBin readRequestNewBin(@RequestBody RequestNewBin requestNewBin) {
        return requestNewBinService.readRequestNewBin(requestNewBin);
    }

    @PostMapping(path="/update")
    public @ResponseBody RequestNewBin updateRequestNewBin(@RequestBody RequestNewBin requestNewBin) {
        return requestNewBinService.updateRequestNewBin(requestNewBin);
    }

    @PostMapping(path="/delete")
    public @ResponseBody RequestNewBin deleteRequestNewBin(@RequestBody RequestNewBin requestNewBin) {
        return requestNewBinService.deleteRequestNewBin(requestNewBin);
    }
}
