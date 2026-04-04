package com.aruna.wcms.scheduleNewRoute.service;

import com.aruna.wcms.scheduleNewRoute.model.ScheduleNewRoute;
import com.aruna.wcms.scheduleNewRoute.repository.ScheduleNewRouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScheduleNewRouteServiceImpl implements ScheduleNewRouteService {

    @Autowired
    ScheduleNewRouteRepository scheduleNewRouteRepository;

    @Override
    public ScheduleNewRoute createScheduleNewRoute(ScheduleNewRoute scheduleNewRoute) {
        return null;
    }

    @Override
    public ScheduleNewRoute readScheduleNewRoute(ScheduleNewRoute scheduleNewRoute) {
        return null;
    }

    @Override
    public Iterable<ScheduleNewRoute> readScheduleNewRouteVehicleIdAndJobRole(ScheduleNewRoute scheduleNewRoute) {
        return null;
    }

    @Override
    public Iterable<ScheduleNewRoute> readAllScheduleNewRoute() {
        return null;
    }

    @Override
    public ScheduleNewRoute updateScheduleNewRoute(ScheduleNewRoute scheduleNewRoute) {
        return null;
    }

    @Override
    public ScheduleNewRoute deleteScheduleNewRoute(ScheduleNewRoute scheduleNewRoute) {
        return null;
    }
}
