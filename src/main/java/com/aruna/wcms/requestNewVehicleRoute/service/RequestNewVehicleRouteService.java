package com.aruna.wcms.requestNewVehicleRoute.service;


import com.aruna.wcms.requestNewVehicleRoute.model.RequestNewVehicleRoute;

public interface RequestNewVehicleRouteService {

    RequestNewVehicleRoute createRequestNewVehicleRoute(RequestNewVehicleRoute requestNewVehicleRoute);

    //Iterable<RequestNewVehicleRoute> readAllRequestNewVehicleRoute(RequestNewVehicleRoute requestNewVehicleRoute);

    RequestNewVehicleRoute readRequestNewVehicleRoute(RequestNewVehicleRoute requestNewVehicleRoute);

    RequestNewVehicleRoute updateRequestNewVehicleRoute(RequestNewVehicleRoute requestNewVehicleRoute);

    RequestNewVehicleRoute deleteRequestNewVehicleRoute(RequestNewVehicleRoute requestNewVehicleRoute);
}
