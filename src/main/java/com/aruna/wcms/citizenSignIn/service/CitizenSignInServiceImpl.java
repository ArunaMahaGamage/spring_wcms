package com.aruna.wcms.citizenSignIn.service;

import com.aruna.wcms.citizenSignIn.model.CitizenSignIn;
import com.aruna.wcms.citizenSignIn.repository.CitizenSignInRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitizenSignInServiceImpl implements CitizenSignInService {

    @Autowired
    CitizenSignInRepository citizenSignInRepository;

    @Override
    public CitizenSignIn createCitizen(CitizenSignIn citizenSignIn) {
        return citizenSignInRepository.save(citizenSignIn);
    }

    @Override
    public CitizenSignIn readCitizen(CitizenSignIn citizenSignIn) {
        return null;
    }

    @Override
    public CitizenSignIn updateCitizen(CitizenSignIn citizenSignIn) {
        return null;
    }

    @Override
    public CitizenSignIn deleteCitizen(CitizenSignIn citizenSignIn) {
        return null;
    }
}
