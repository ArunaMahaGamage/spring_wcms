package com.aruna.wcms.scheduleNewRoute.service;


import com.aruna.wcms.scheduleNewRoute.model.ScheduleNewRoute;

public interface ScheduleNewRouteService {
    ScheduleNewRoute createScheduleNewRoute(ScheduleNewRoute scheduleNewRoute);

    ScheduleNewRoute readScheduleNewRoute(ScheduleNewRoute scheduleNewRoute);

    Iterable<ScheduleNewRoute> readScheduleNewRouteVehicleId(ScheduleNewRoute scheduleNewRoute);

    Iterable<ScheduleNewRoute> readAllScheduleNewRoute();

    ScheduleNewRoute updateScheduleNewRoute(ScheduleNewRoute scheduleNewRoute);

    ScheduleNewRoute deleteScheduleNewRoute(ScheduleNewRoute scheduleNewRoute);
}
