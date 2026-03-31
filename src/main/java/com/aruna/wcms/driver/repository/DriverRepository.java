package com.aruna.wcms.driver.repository;

import com.aruna.wcms.driver.model.Driver;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DriverRepository extends CrudRepository<Driver, Integer> {

    Optional<Driver> findByDriverIdNumber (String driverIdNumber);

    Optional<Driver> findByDriverLicenceNumber (String driverLicenceNumber);

    Optional<Driver> findByEmail (String email);
}
