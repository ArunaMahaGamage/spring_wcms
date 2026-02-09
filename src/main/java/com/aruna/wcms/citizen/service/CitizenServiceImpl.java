package com.aruna.wcms.citizen.service;

import com.aruna.wcms.citizen.model.Citizen;
import com.aruna.wcms.citizen.repository.CitizenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitizenServiceImpl implements CitizenService {

    @Autowired
    CitizenRepository citizenRepository;

    @Override
    public Citizen createCitizen(Citizen citizen) {
        return null;
    }

    @Override
    public Citizen readCitizen(Citizen citizen) {
        return null;
    }

    @Override
    public Citizen updateCitizen(Citizen citizen) {
        return null;
    }

    @Override
    public Citizen deleteCitizen(Citizen citizen) {
        return null;
    }
}
