package com.aruna.wcms.citizenSignIn.service;

import com.aruna.wcms.citizenSignIn.model.CitizenSignIn;
import com.aruna.wcms.citizenSignIn.repository.CitizenSignInRepository;
import com.aruna.wcms.exceptions.ResourceNotFoundException;
import com.aruna.wcms.submitComplain.model.Complain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CitizenSignInServiceImpl implements CitizenSignInService {

    @Autowired
    CitizenSignInRepository citizenSignInRepository;

    @Override
    public CitizenSignIn createCitizen(CitizenSignIn citizenSignIn) {
        if (!(citizenSignIn.getIdNumber().isBlank())) {
            return citizenSignInRepository.save(citizenSignIn);
        } else {
            return null;
        }
    }

    @Override
    public CitizenSignIn readCitizen(CitizenSignIn citizenSignIn) {
        //Optional<CitizenSignIn> complainResult = citizenSignInRepository.findById(citizenSignIn.getId());
        //Optional<CitizenSignIn> complainResult = citizenSignInRepository.findByIdNumber(citizenSignIn.getIdNumber());
        Optional<CitizenSignIn> complainResult = citizenSignInRepository.findByUserID(citizenSignIn.getUserID());

        // Handle the Optional result
        if (complainResult.isPresent()) {
            CitizenSignIn citizenSignInResponse = complainResult.get();
            if ((citizenSignIn.getUserID().equals(citizenSignInResponse.getUserID())) &&
                    (citizenSignIn.getPassword().equals(citizenSignInResponse.getPassword()))) {
                citizenSignInResponse.setPassword("");
                return citizenSignInResponse;
            } else {
                throw new RuntimeException("Product not found for id :: " + citizenSignIn.getId());
            }
        } else {
            // Or throw an exception, return null, etc.
            throw new RuntimeException("Product not found for id :: " + citizenSignIn.getId());
        }
    }

    @Override
    public CitizenSignIn updateCitizen(CitizenSignIn citizenSignIn) {
        return citizenSignInRepository.findById(citizenSignIn.getId()).map(complainUpdate -> {
            complainUpdate.setPassword(citizenSignIn.getPassword());
            complainUpdate.setOauth2Token(citizenSignIn.getOauth2Token());
            complainUpdate.setRefreshToken(citizenSignIn.getRefreshToken());
            // Update other properties as needed

            // The save method is not strictly necessary inside a @Transactional
            // service method because changes to managed entities are flushed
            // automatically at transaction commit, but calling it makes the
            // intention clear and works in non-transactional contexts too.
            return citizenSignInRepository.save(complainUpdate);
        }).orElseThrow(() -> new ResourceNotFoundException("User not found with id " + citizenSignIn.getId()));
    }

    @Override
    public CitizenSignIn deleteCitizen(CitizenSignIn citizenSignIn) {
        citizenSignInRepository.deleteById(citizenSignIn.getId());
        return null;
    }
}
