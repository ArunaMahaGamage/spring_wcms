package com.aruna.wcms.vehicleLocation.repository;

import com.aruna.wcms.vehicleLocation.model.VehicleLocation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleLocationRepository extends CrudRepository<VehicleLocation, Integer> {
}
