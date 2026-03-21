package com.aruna.wcms.requestNewVehicleRoute.service;

import com.aruna.wcms.exceptions.ResourceNotFoundException;
import com.aruna.wcms.requestNewVehicleRoute.model.RequestNewVehicleRoute;
import com.aruna.wcms.requestNewVehicleRoute.repository.RequestNewVehicleRouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RequestNewVehicleRouteServiceImpl implements RequestNewVehicleRouteService {

    @Autowired
    RequestNewVehicleRouteRepository requestNewVehicleRouteRepository;


    @Override
    public RequestNewVehicleRoute createRequestNewVehicleRoute(RequestNewVehicleRoute requestNewVehicleRoute) {
        if (!requestNewVehicleRoute.getIdNumber().isEmpty()) {
            RequestNewVehicleRoute requestNewVehicleRouteResponse =  requestNewVehicleRouteRepository.save(requestNewVehicleRoute);
            /*RequestNewVehicleRoute requestNewVehicleRouteSignIn = new RequestNewVehicleRoute();
            requestNewVehicleRouteSignIn.setIdNumber(requestNewVehicleRoute.getIdNumber());
            requestNewVehicleRouteSignIn.setUserID(requestNewVehicleRoute.getEmail());
            requestNewVehicleRouteSignIn.setPassword(requestNewVehicleRoute.getPassword());
            new CitizenSignUpApiCall().callApiCitizenSignIn(requestNewVehicleRouteSignIn);*/
            return requestNewVehicleRouteResponse;
        } else {
            return null;
        }
    }

    @Override
    public RequestNewVehicleRoute readRequestNewVehicleRoute(RequestNewVehicleRoute requestNewVehicleRoute) {
        Optional<RequestNewVehicleRoute> requestNewVehicleRouteResult = requestNewVehicleRouteRepository.findById(requestNewVehicleRoute.getId());

        // Handle the Optional result
        if (requestNewVehicleRouteResult.isPresent()) {
            return requestNewVehicleRouteResult.get();
        } else {
            // Or throw an exception, return null, etc.
            throw new RuntimeException("Product not found for id :: " + requestNewVehicleRoute.getId());
        }
    }

    @Override
    public RequestNewVehicleRoute updateRequestNewVehicleRoute(RequestNewVehicleRoute requestNewVehicleRoute) {
        return requestNewVehicleRouteRepository.findById(requestNewVehicleRoute.getId()).map(requestNewVehicleRouteUpdate -> {
            requestNewVehicleRouteUpdate.setAddress(requestNewVehicleRoute.getAddress());
            requestNewVehicleRouteUpdate.setDescription(requestNewVehicleRoute.getDescription());
            // Update other properties as needed

            // The save method is not strictly necessary inside a @Transactional
            // service method because changes to managed entities are flushed
            // automatically at transaction commit, but calling it makes the
            // intention clear and works in non-transactional contexts too.
            return requestNewVehicleRouteRepository.save(requestNewVehicleRouteUpdate);
        }).orElseThrow(() -> new ResourceNotFoundException("User not found with id " + requestNewVehicleRoute.getId()));
    }

    @Override
    public RequestNewVehicleRoute deleteRequestNewVehicleRoute(RequestNewVehicleRoute requestNewVehicleRoute) {
        return null;
    }
}
