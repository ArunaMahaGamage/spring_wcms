package com.aruna.wcms.administratorSignIn.service;

import com.aruna.wcms.administratorSignIn.model.AdministratorSignIn;
import com.aruna.wcms.administratorSignIn.repository.AdministratorSignInRepository;
import com.aruna.wcms.citizenSignIn.model.CitizenSignIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdministratorSignInServiceImpl implements AdministratorSignInService {

    @Autowired
    AdministratorSignInRepository administratorSignInRepository;

    @Override
    public AdministratorSignIn createAdministratorSignIn(AdministratorSignIn administratorSignIn) {
        return administratorSignInRepository.save(administratorSignIn);
    }

    @Override
    public AdministratorSignIn readAdministratorSignIn(AdministratorSignIn administratorSignIn) {
        Optional<AdministratorSignIn> complainResult = administratorSignInRepository.findByUserID(administratorSignIn.getUserID());

        // Handle the Optional result
        if (complainResult.isPresent()) {
            AdministratorSignIn citizenSignInResponse = complainResult.get();
            if ((administratorSignIn.getUserID().equals(citizenSignInResponse.getUserID())) &&
                    (administratorSignIn.getPassword().equals(citizenSignInResponse.getPassword()))) {
                citizenSignInResponse.setPassword("");
                return citizenSignInResponse;
            } else {
                throw new RuntimeException("Product not found for id :: " + administratorSignIn.getId());
            }
        } else {
            // Or throw an exception, return null, etc.
            throw new RuntimeException("Product not found for id :: " + administratorSignIn.getId());
        }
    }

    @Override
    public AdministratorSignIn updateAdministratorSignIn(AdministratorSignIn administratorSignIn) {
        return null;
    }

    @Override
    public AdministratorSignIn deleteAdministratorSignIn(AdministratorSignIn administratorSignIn) {
        return null;
    }
}
