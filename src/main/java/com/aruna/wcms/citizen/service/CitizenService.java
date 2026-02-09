package com.aruna.wcms.citizen.service;

import com.aruna.wcms.citizen.model.Citizen;

public interface CitizenService {
    Citizen createCitizen(Citizen citizen);

    Citizen readCitizen(Citizen citizen);

    Citizen updateCitizen(Citizen citizen);

    Citizen deleteCitizen(Citizen citizen);
}
