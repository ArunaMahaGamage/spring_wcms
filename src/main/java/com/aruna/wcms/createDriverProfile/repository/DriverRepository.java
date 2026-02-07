package com.aruna.wcms.createDriverProfile.repository;

import com.aruna.wcms.createDriverProfile.model.Driver;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends CrudRepository<Driver, Integer> {
}
