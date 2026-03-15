package com.aruna.wcms.citizen.repository;

import com.aruna.wcms.citizen.model.Citizen;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CitizenRepository extends CrudRepository<Citizen, Integer> {

    Optional<Citizen> findByIdNumber(String idNumber);
}
