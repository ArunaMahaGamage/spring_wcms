package com.aruna.wcms.requestNewBin.repository;

import com.aruna.wcms.requestNewBin.model.RequestNewBin;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RequestNewBinRepository extends CrudRepository<RequestNewBin, Integer>  {

    Optional<RequestNewBin> findByIdNumber(String idNumber);

    Optional<RequestNewBin> findByEmail(String email);

}
