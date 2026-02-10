package com.aruna.wcms.administratorSignIn.service;

import com.aruna.wcms.administratorSignIn.model.AdministratorSignIn;
import com.aruna.wcms.administratorSignIn.repository.AdministratorSignInRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministratorSignInServiceImpl implements AdministratorSignInService {

    @Autowired
    AdministratorSignInRepository administratorSignInRepository;

    @Override
    public AdministratorSignIn createCitizen(AdministratorSignIn administratorSignIn) {
        return null;
    }

    @Override
    public AdministratorSignIn readCitizen(AdministratorSignIn administratorSignIn) {
        return null;
    }

    @Override
    public AdministratorSignIn updateCitizen(AdministratorSignIn administratorSignIn) {
        return null;
    }

    @Override
    public AdministratorSignIn deleteCitizen(AdministratorSignIn administratorSignIn) {
        return null;
    }
}
