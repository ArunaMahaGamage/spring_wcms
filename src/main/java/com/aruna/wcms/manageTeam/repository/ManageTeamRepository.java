package com.aruna.wcms.manageTeam.repository;

import com.aruna.wcms.manageTeam.model.ManageTeam;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ManageTeamRepository extends CrudRepository <ManageTeam, Integer> {

    Optional<ManageTeam> findByVehicleId(String vehicleId);

    Optional<Iterable<ManageTeam>> findByVehicleIdAndJobRole(String vehicleId, String jobRole);

    Optional<ManageTeam> findByIdNumber(String idNumber);
}
