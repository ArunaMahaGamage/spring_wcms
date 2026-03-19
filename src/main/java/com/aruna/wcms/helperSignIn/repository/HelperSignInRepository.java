package com.aruna.wcms.helperSignIn.repository;

import com.aruna.wcms.helperSignIn.model.HelperSignIn;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface HelperSignInRepository extends CrudRepository <HelperSignIn, Integer> {

    Optional<HelperSignIn> findByUserId(String userID);
}
