package com.aruna.wcms.driverSignIn.repository;

import com.aruna.wcms.driverSignIn.model.DriverSignIn;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface DriverSignInRepository extends CrudRepository <DriverSignIn, Integer> {

    Optional<DriverSignIn> findByUserID(String userID);
}
