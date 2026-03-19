package com.aruna.wcms.citizen.service;

import com.aruna.wcms.api.citizen.CitizenSignUpApiCall;
import com.aruna.wcms.citizen.model.Citizen;
import com.aruna.wcms.citizen.repository.CitizenRepository;
import com.aruna.wcms.citizenSignIn.model.CitizenSignIn;
import com.aruna.wcms.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CitizenServiceImpl implements CitizenService {

    @Autowired
    CitizenRepository citizenRepository;

    @Override
    public Citizen createCitizen(Citizen citizen) {

        /*if (!(citizen.getIdNumber().isEmpty())) {
            return citizenRepository.save(citizen);
        } else {
            return null;
        }*/
        if (!citizen.getIdNumber().isEmpty()) {
            Citizen driverResponse =  citizenRepository.save(citizen);
            CitizenSignIn citizenSignIn = new CitizenSignIn();
            citizenSignIn.setIdNumber(citizen.getIdNumber());
            citizenSignIn.setUserID(citizen.getEmail());
            citizenSignIn.setPassword(citizen.getPassword());
            new CitizenSignUpApiCall().callApiCitizenSignIn(citizenSignIn);
            return driverResponse;
        } else {
            return null;
        }
    }

    @Override
    public Citizen readCitizen(Citizen citizen) {
        Optional<Citizen> citizenResult = citizenRepository.findById(citizen.getId());

        // Handle the Optional result
        if (citizenResult.isPresent()) {
            return citizenResult.get();
        } else {
            // Or throw an exception, return null, etc.
            throw new RuntimeException("Product not found for id :: " + citizen.getId());
        }
    }

    @Override
    public Citizen updateCitizen(Citizen citizen) {
        return citizenRepository.findById(citizen.getId()).map(citizenUpdate -> {
            citizenUpdate.setFirstName(citizen.getFirstName());
            citizenUpdate.setLastName(citizen.getLastName());
            // Update other properties as needed

            // The save method is not strictly necessary inside a @Transactional
            // service method because changes to managed entities are flushed
            // automatically at transaction commit, but calling it makes the
            // intention clear and works in non-transactional contexts too.
            return citizenRepository.save(citizenUpdate);
        }).orElseThrow(() -> new ResourceNotFoundException("User not found with id " + citizen.getId()));
    }

    @Override
    public Citizen deleteCitizen(Citizen citizen) {
        return null;
    }
}
