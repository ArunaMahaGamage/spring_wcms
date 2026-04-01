package com.aruna.wcms.Helper.repository;

import com.aruna.wcms.Helper.model.Helper;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface HelperRepository extends CrudRepository<Helper, Integer> {

    Optional<Helper> findByIdNumber(String idNumber);

}
