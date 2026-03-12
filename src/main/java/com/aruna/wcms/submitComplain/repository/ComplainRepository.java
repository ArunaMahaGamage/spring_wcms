package com.aruna.wcms.submitComplain.repository;

import com.aruna.wcms.submitComplain.model.Complain;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ComplainRepository extends CrudRepository<Complain, Integer> {

    Optional<Complain> findByComplainIDNumber(String complainIDNumber);

    Optional<Iterable<Complain>> findByCitizenIDNumber(String citizenIDNumber);
}
