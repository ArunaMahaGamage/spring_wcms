package com.aruna.wcms.citizenSignIn.repository;

import com.aruna.wcms.citizenSignIn.model.CitizenSignIn;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

public interface CitizenSignInRepository extends CrudRepository<CitizenSignIn, Integer> {

    Optional<CitizenSignIn> findByIdNumber(String idNumber);

    Optional<CitizenSignIn> findByUserID(String userID);

}
