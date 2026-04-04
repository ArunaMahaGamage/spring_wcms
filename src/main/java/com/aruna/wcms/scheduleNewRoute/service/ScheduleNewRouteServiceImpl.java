package com.aruna.wcms.scheduleNewRoute.service;

import com.aruna.wcms.exceptions.ResourceNotFoundException;
import com.aruna.wcms.scheduleNewRoute.model.ScheduleNewRoute;
import com.aruna.wcms.scheduleNewRoute.repository.ScheduleNewRouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ScheduleNewRouteServiceImpl implements ScheduleNewRouteService {

    @Autowired
    ScheduleNewRouteRepository scheduleNewRouteRepository;

    @Override
    public ScheduleNewRoute createScheduleNewRoute(ScheduleNewRoute scheduleNewRoute) {
        if (!scheduleNewRoute.getVehicleId().isEmpty()) {
            ScheduleNewRoute scheduleNewRouteResponse =  scheduleNewRouteRepository.save(scheduleNewRoute);

            return scheduleNewRouteResponse;
        } else {
            return null;
        }
    }

    @Override
    public ScheduleNewRoute readScheduleNewRoute(ScheduleNewRoute scheduleNewRoute) {
        Optional<ScheduleNewRoute> scheduleNewRouteResult = scheduleNewRouteRepository.findById(scheduleNewRoute.getId());

        // Handle the Optional result
        if (scheduleNewRouteResult.isPresent()) {
            return scheduleNewRouteResult.get();
        } else {
            // Or throw an exception, return null, etc.
            throw new RuntimeException("ScheduleNewRoute not found for id :: " + scheduleNewRoute.getId());
        }
    }

    @Override
    public Iterable<ScheduleNewRoute> readScheduleNewRouteVehicleId(ScheduleNewRoute scheduleNewRoute) {
        Optional<Iterable<ScheduleNewRoute>> scheduleNewRouteResult = scheduleNewRouteRepository.findAllByVehicleId(scheduleNewRoute.getVehicleId());
        if (scheduleNewRouteResult.get().iterator().hasNext()) {
            return scheduleNewRouteResult.orElse(null);
        } else {
            // Or throw an exception, return null, etc.
            throw new RuntimeException("ScheduleNewRoute is not found.");
        }
    }

    @Override
    public Iterable<ScheduleNewRoute> readAllScheduleNewRoute() {
        Optional<Iterable<ScheduleNewRoute>> scheduleNewRouteResult = Optional.of(scheduleNewRouteRepository.findAll());
        if (scheduleNewRouteResult.get().iterator().hasNext()) {
            return scheduleNewRouteResult.orElse(null);
        } else {
            // Or throw an exception, return null, etc.
            throw new RuntimeException("ScheduleNewRoute is not found.");
        }
    }

    @Override
    public ScheduleNewRoute updateScheduleNewRoute(ScheduleNewRoute scheduleNewRoute) {
        return scheduleNewRouteRepository.findById(scheduleNewRoute.getId()).map(scheduleNewRouteUpdate -> {
            scheduleNewRouteUpdate.setZoneName(scheduleNewRoute.getZoneName());
            scheduleNewRouteUpdate.setVehicleId(scheduleNewRoute.getVehicleId());
            scheduleNewRouteUpdate.setDriverId(scheduleNewRoute.getDriverId());
            // Update other properties as needed

            // The save method is not strictly necessary inside a @Transactional
            // service method because changes to managed entities are flushed
            // automatically at transaction commit, but calling it makes the
            // intention clear and works in non-transactional contexts too.
            return scheduleNewRouteRepository.save(scheduleNewRouteUpdate);
        }).orElseThrow(() -> new ResourceNotFoundException("User not found with id " + scheduleNewRoute.getId()));
    }

    @Override
    public ScheduleNewRoute deleteScheduleNewRoute(ScheduleNewRoute scheduleNewRoute) {
        scheduleNewRouteRepository.delete(scheduleNewRoute);
        return scheduleNewRoute;
    }
}
