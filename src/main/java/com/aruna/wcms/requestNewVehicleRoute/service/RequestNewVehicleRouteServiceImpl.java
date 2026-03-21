package com.aruna.wcms.requestNewVehicleRoute.service;

import com.aruna.wcms.requestNewVehicleRoute.model.RequestNewVehicleRoute;
import com.aruna.wcms.requestNewVehicleRoute.repository.RequestNewVehicleRouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestNewVehicleRouteServiceImpl implements RequestNewVehicleRouteService {

    @Autowired
    RequestNewVehicleRouteRepository requestNewVehicleRouteRepository;


    @Override
    public RequestNewVehicleRoute createRequestNewVehicleRoute(RequestNewVehicleRoute requestNewVehicleRoute) {
        return null;
    }

    @Override
    public RequestNewVehicleRoute readRequestNewVehicleRoute(RequestNewVehicleRoute requestNewVehicleRoute) {
        return null;
    }

    @Override
    public RequestNewVehicleRoute updateRequestNewVehicleRoute(RequestNewVehicleRoute requestNewVehicleRoute) {
        return null;
    }

    @Override
    public RequestNewVehicleRoute deleteRequestNewVehicleRoute(RequestNewVehicleRoute requestNewVehicleRoute) {
        return null;
    }
}
