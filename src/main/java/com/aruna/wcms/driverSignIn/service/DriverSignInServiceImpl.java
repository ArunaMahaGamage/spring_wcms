package com.aruna.wcms.driverSignIn.service;

import com.aruna.wcms.driverSignIn.model.DriverSignIn;
import com.aruna.wcms.driverSignIn.repository.DriverSignInRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return null;
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
