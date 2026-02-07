package com.aruna.wcms.driver.service;

import com.aruna.wcms.driver.model.Driver;
import com.aruna.wcms.driver.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DriverServiceImpl implements DriverService {

    @Autowired
    DriverRepository driverRepository;

    @Override
    public Driver addDriver(Driver driver) {
        return driverRepository.save(driver);
    }

    @Override
    public Driver updateDriver(Driver driver) {
        return null;
        /*return driverRepository.findById(driver.getId()).map(user -> {
            user.setFirstName(driver.getFirstName());
            user.setLastName(driver.getLastName());
            // Update other properties as needed

            // The save method is not strictly necessary inside a @Transactional
            // service method because changes to managed entities are flushed
            // automatically at transaction commit, but calling it makes the
            // intention clear and works in non-transactional contexts too.
            return driverRepository.save(user);
        }).orElseThrow(() -> new ResourceNotFoundException("User not found with id " + driver.getId()));*/
    }

    @Override
    public Driver readDriver(Driver driver) {
        Optional<Driver> optionalProduct = driverRepository.findById(driver.getId());

        // Handle the Optional result
        if (optionalProduct.isPresent()) {
            return optionalProduct.get();
        } else {
            // Or throw an exception, return null, etc.
            throw new RuntimeException("Product not found for id :: " + driver.getId());
        }
    }

    @Override
    public Driver deleteDriver(Driver driver) {
        driverRepository.deleteById(driver.getId());
        return null;
    }
}
