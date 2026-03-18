package com.aruna.wcms.administratorSignIn.repository;

import com.aruna.wcms.administratorSignIn.model.AdministratorSignIn;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AdministratorSignInRepository extends CrudRepository<AdministratorSignIn, Integer> {

    Optional<AdministratorSignIn> findByUserID(String userID);

}
