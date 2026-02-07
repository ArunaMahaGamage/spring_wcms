package com.aruna.wcms.createDriverProfile.service;


import com.aruna.wcms.createDriverProfile.model.Driver;

public interface DriverService {
    Driver addDriver(Driver driver);

    Driver updateDriver(Driver driver);

    Driver readDriver(Driver driver);

    Driver deleteDriver(Driver driver);
}
