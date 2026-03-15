package com.aruna.wcms.driverSignIn.service;


import com.aruna.wcms.driverSignIn.model.DriverSignIn;

public interface DriverSignInService {
    DriverSignIn createDriverSignIn(DriverSignIn driverSignIn);

    DriverSignIn readDriverSignIn(DriverSignIn driverSignIn);

    DriverSignIn updateDriverSignIn(DriverSignIn driverSignIn);

    DriverSignIn deleteDriverSignIn(DriverSignIn driverSignIn);
}
