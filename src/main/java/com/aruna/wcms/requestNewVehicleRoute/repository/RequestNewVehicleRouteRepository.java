package com.aruna.wcms.requestNewVehicleRoute.repository;

import com.aruna.wcms.requestNewVehicleRoute.model.RequestNewVehicleRoute;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RequestNewVehicleRouteRepository extends CrudRepository<RequestNewVehicleRoute, Integer> {

    Optional<RequestNewVehicleRoute> findByIdNumber(String idNumber);

    Optional<RequestNewVehicleRoute> findByEmail(String email);
}
