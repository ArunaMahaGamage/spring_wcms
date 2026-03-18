package com.aruna.wcms.administrator.repository;

import com.aruna.wcms.administrator.model.Administrator;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AdministratorRepository extends CrudRepository<Administrator, Integer> {

    Optional<Administrator> findByIdNumber(String idNumber);

    Optional<Administrator> findByEmail(String email);
}
