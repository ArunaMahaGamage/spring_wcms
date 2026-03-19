package com.aruna.wcms.helperSignIn.service;

import com.aruna.wcms.driverSignIn.model.DriverSignIn;
import com.aruna.wcms.helperSignIn.model.HelperSignIn;
import com.aruna.wcms.helperSignIn.repository.HelperSignInRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HelperSignInServiceImpl implements HelperSignInService {

    @Autowired
    HelperSignInRepository helperSignInRepository;


    @Override
    public HelperSignIn creatHelperSignIn(HelperSignIn helper) {
        if (!helper.getIdNumber().isEmpty()) {
            HelperSignIn driverSignInResponse = helperSignInRepository.save(helper);

            return helper;
        } else {
            return null;
        }
    }

    @Override
    public HelperSignIn readHelperSignIn(HelperSignIn helperSignIn) {
        Optional<HelperSignIn> driverSignInResult = helperSignInRepository.findByUserId(helperSignIn.getUserId());

        // Handle the Optional result
        if (driverSignInResult.isPresent()) {
            HelperSignIn driverSignInResponse = driverSignInResult.get();
            if ((helperSignIn.getUserId().equals(driverSignInResponse.getUserId())) &&
                    (helperSignIn.getPassword().equals(driverSignInResponse.getPassword()))) {
                driverSignInResponse.setPassword("");
                return driverSignInResponse;
            } else {
                throw new RuntimeException("Driver not found for id :: " + helperSignIn.getId());
            }
        } else {
            // Or throw an exception, return null, etc.
            throw new RuntimeException("Driver not found for id :: " + helperSignIn.getId());
        }
    }

    @Override
    public HelperSignIn updateHelperSignIn(HelperSignIn helper) {
        return null;
    }

    @Override
    public HelperSignIn deleteHelperSignIn(HelperSignIn helper) {
        return null;
    }
}
