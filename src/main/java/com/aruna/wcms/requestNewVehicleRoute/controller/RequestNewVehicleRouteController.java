package com.aruna.wcms.requestNewVehicleRoute.controller;

import com.aruna.wcms.requestNewVehicleRoute.model.RequestNewVehicleRoute;
import com.aruna.wcms.requestNewVehicleRoute.service.RequestNewVehicleRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

@RequestMapping(path="/api/request-new-vehicle-route")
public class RequestNewVehicleRouteController {

    @Autowired
    RequestNewVehicleRouteService requestNewVehicleRouteService;

    @PostMapping(path="/create")
    public @ResponseBody RequestNewVehicleRoute createRequestNewVehicleRoute(@RequestBody RequestNewVehicleRoute requestNewVehicleRoute) {
        return null;
    }

    @PostMapping(path="/read")
    public @ResponseBody RequestNewVehicleRoute readRequestNewVehicleRoute(@RequestBody RequestNewVehicleRoute requestNewVehicleRoute) {
        return null;
    }

    @PostMapping(path="/update")
    public @ResponseBody RequestNewVehicleRoute updateRequestNewVehicleRoute(@RequestBody RequestNewVehicleRoute requestNewVehicleRoute) {
        return null;
    }

    @PostMapping(path="/delete")
    public @ResponseBody RequestNewVehicleRoute deleteRequestNewVehicleRoute(@RequestBody RequestNewVehicleRoute requestNewVehicleRoute) {
        return null;
    }

}
