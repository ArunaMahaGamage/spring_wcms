package com.aruna.wcms.driverSignIn.service;

import com.aruna.wcms.driverSignIn.model.DriverSignIn;
import com.aruna.wcms.driverSignIn.repository.DriverSignInRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DriverSignInServiceImpl implements DriverSignInService {

    @Autowired
    DriverSignInRepository driverSignInRepository;

    @Override
    public DriverSignIn createDriverSignIn(DriverSignIn driverSignIn) {
        if (!driverSignIn.getDriverLicenceNumber().isEmpty()) {
            DriverSignIn driverSignInResponse = driverSignInRepository.save(driverSignIn);

            return driverSignIn;
        } else {
            return null;
        }
    }

    @Override
    public DriverSignIn readDriverSignIn(DriverSignIn driverSignIn) {
        Optional<DriverSignIn> driverSignInResult = driverSignInRepository.findByUserId(driverSignIn.getUserId());

        // Handle the Optional result
        if (driverSignInResult.isPresent()) {
            DriverSignIn driverSignInResponse = driverSignInResult.get();
            if ((driverSignIn.getUserId().equals(driverSignInResponse.getUserId())) &&
                    (driverSignIn.getPassword().equals(driverSignInResponse.getPassword()))) {
                driverSignInResponse.setPassword("");
                return driverSignInResponse;
            } else {
                throw new RuntimeException("Driver not found for id :: " + driverSignIn.getId());
            }
        } else {
            // Or throw an exception, return null, etc.
            throw new RuntimeException("Driver not found for id :: " + driverSignIn.getId());
        }
    }

    @Override
    public DriverSignIn updateDriverSignIn(DriverSignIn driverSignIn) {
        return null;
    }

    @Override
    public DriverSignIn deleteDriverSignIn(DriverSignIn driverSignIn) {
        return null;
    }
}
