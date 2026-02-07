package com.aruna.wcms.driver.service;


import com.aruna.wcms.driver.model.Driver;

public interface DriverService {
    Driver createDriver(Driver driver);

    Driver readDriver(Driver driver);

    Driver updateDriver(Driver driver);

    Driver deleteDriver(Driver driver);
}
