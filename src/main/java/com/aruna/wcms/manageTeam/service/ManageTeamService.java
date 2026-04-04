package com.aruna.wcms.manageTeam.service;


import com.aruna.wcms.manageTeam.model.ManageTeam;

public interface ManageTeamService {
    ManageTeam createManageTeam(ManageTeam manageTeam);

    ManageTeam readManageTeam(ManageTeam manageTeam);

    Iterable<ManageTeam> readManageTeamVehicleIdAndJobRole(ManageTeam manageTeam);

    ManageTeam updateManageTeam(ManageTeam manageTeam);

    ManageTeam deleteManageTeam(ManageTeam manageTeam);
}
