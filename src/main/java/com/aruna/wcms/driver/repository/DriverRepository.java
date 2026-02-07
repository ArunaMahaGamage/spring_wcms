package com.aruna.wcms.driver.repository;

import com.aruna.wcms.driver.model.Driver;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends CrudRepository<Driver, Integer> {
}
