package com.aruna.wcms.manageTeam.service;

import com.aruna.wcms.exceptions.ResourceNotFoundException;
import com.aruna.wcms.manageTeam.model.ManageTeam;
import com.aruna.wcms.manageTeam.repository.ManageTeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ManageTeamServiceImpl implements ManageTeamService {

    @Autowired
    ManageTeamRepository manageTeamRepository;

    @Override
    public ManageTeam createManageTeam(ManageTeam manageTeam) {
        if (!manageTeam.getIdNumber().isEmpty()) {
            ManageTeam manageTeamResponse =  manageTeamRepository.save(manageTeam);

            return manageTeamResponse;
        } else {
            return null;
        }
    }

    @Override
    public ManageTeam readManageTeam(ManageTeam manageTeam) {
        Optional<ManageTeam> manageTeamResult = manageTeamRepository.findByVehicleId(manageTeam.getVehicleId());

        // Handle the Optional result
        if (manageTeamResult.isPresent()) {
            return manageTeamResult.get();
        } else {
            // Or throw an exception, return null, etc.
            throw new RuntimeException("Product not found for id :: " + manageTeam.getId());
        }
    }

    @Override
    public Iterable<ManageTeam> readManageTeamVehicleIdAndJobRole(ManageTeam manageTeam) {
        Optional<Iterable<ManageTeam>> manageTeamResult = manageTeamRepository.findByVehicleIdAndJobRole(manageTeam.getVehicleId(), manageTeam.getJobRole());
        if (manageTeamResult.get().iterator().hasNext()) {
            return manageTeamResult.orElse(null);
        } else {
            // Or throw an exception, return null, etc.
            throw new RuntimeException("Complain is not found.");
        }
    }

    @Override
    public ManageTeam updateManageTeam(ManageTeam manageTeam) {
        return manageTeamRepository.findById(manageTeam.getId()).map(manageTeamUpdate -> {
            manageTeamUpdate.setIdNumber(manageTeam.getIdNumber());
            manageTeamUpdate.setVehicleId(manageTeam.getVehicleId());
            manageTeamUpdate.setJobRole(manageTeam.getJobRole());
            // Update other properties as needed

            // The save method is not strictly necessary inside a @Transactional
            // service method because changes to managed entities are flushed
            // automatically at transaction commit, but calling it makes the
            // intention clear and works in non-transactional contexts too.
            return manageTeamRepository.save(manageTeamUpdate);
        }).orElseThrow(() -> new ResourceNotFoundException("User not found with id " + manageTeam.getId()));
    }

    @Override
    public ManageTeam deleteManageTeam(ManageTeam manageTeam) {
        manageTeamRepository.delete(manageTeam);
        return manageTeam;
    }
}
