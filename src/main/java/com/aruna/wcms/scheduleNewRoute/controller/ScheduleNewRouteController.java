package com.aruna.wcms.scheduleNewRoute.controller;

import com.aruna.wcms.scheduleNewRoute.model.ScheduleNewRoute;
import com.aruna.wcms.scheduleNewRoute.service.ScheduleNewRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

@RequestMapping(path="/api/schedule-new-route")
public class ScheduleNewRouteController {

    @Autowired
    ScheduleNewRouteService scheduleNewRouteService;

    @PostMapping(path="/create")
    public @ResponseBody ScheduleNewRoute createScheduleNewRoute(@RequestBody ScheduleNewRoute scheduleNewRoute) {
        return null;
    }

    @PostMapping(path="/read")
    public @ResponseBody ScheduleNewRoute readScheduleNewRoute(@RequestBody ScheduleNewRoute scheduleNewRoute) {
        return null;
    }

    @PostMapping(path="/read-by-vehicle")
    public @ResponseBody Iterable<ScheduleNewRoute> readScheduleNewRouteVehicleId(@RequestBody ScheduleNewRoute scheduleNewRoute) {
        return null;
    }

    @PostMapping(path="/read-all")
    public @ResponseBody Iterable<ScheduleNewRoute> readAllScheduleNewRoute() {
        return null;
    }

    @PostMapping(path="/update")
    public @ResponseBody ScheduleNewRoute updateScheduleNewRoute(@RequestBody ScheduleNewRoute scheduleNewRoute) {
        return null;
    }

    @PostMapping(path="/delete")
    public @ResponseBody ScheduleNewRoute deleteScheduleNewRoute(@RequestBody ScheduleNewRoute scheduleNewRoute) {
        return null;
    }
}
