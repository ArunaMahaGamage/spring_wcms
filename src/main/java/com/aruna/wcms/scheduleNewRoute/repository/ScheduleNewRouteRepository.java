package com.aruna.wcms.scheduleNewRoute.repository;

import com.aruna.wcms.scheduleNewRoute.model.ScheduleNewRoute;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ScheduleNewRouteRepository extends CrudRepository<ScheduleNewRoute, Integer> {

    //Optional<ScheduleNewRoute> findByVehicleId(String vehicleId);

    //Optional<ScheduleNewRoute> findByZoneName(String zoneName);

    Optional<Iterable<ScheduleNewRoute>> findAllByVehicleId(String vehicleId);

    Optional<Iterable<ScheduleNewRoute>> findByZoneName(String zoneName);

    //Optional<Iterable<ScheduleNewRoute>> findByVehicleIdAndJobRole();

    Optional<ScheduleNewRoute> findByIdNumber(String idNumber);
}
