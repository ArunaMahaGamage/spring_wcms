package com.aruna.wcms.vehicle.repository;

import com.aruna.wcms.vehicle.model.Vehicle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VehicleRepository extends CrudRepository<Vehicle,Integer> {

    Optional<Vehicle> findByVehicleId(String vehicleId);
}
