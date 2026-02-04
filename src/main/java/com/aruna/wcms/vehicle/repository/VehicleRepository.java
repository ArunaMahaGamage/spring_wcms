package com.aruna.wcms.vehicle.repository;

import com.aruna.wcms.vehicle.model.Vehicle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends CrudRepository<Vehicle,Integer> {
}
