package com.aruna.wcms.administrator.service;

import com.aruna.wcms.administrator.model.Administrator;
import com.aruna.wcms.administrator.repository.AdministratorRepository;
import com.aruna.wcms.administratorSignIn.model.AdministratorSignIn;
import com.aruna.wcms.api.administrator.AdministratorSignInApiCall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministratorServiceImpl implements AdministratorService {

    @Autowired
    AdministratorRepository administratorRepository;

    @Override
    public Administrator createAdministrator(Administrator administrator) {
        if (!administrator.getIdNumber().isEmpty()) {
            Administrator administratorResult = administratorRepository.save(administrator);
            AdministratorSignIn administratorSignIn = new AdministratorSignIn();
            administratorSignIn.setIdNumber(administrator.getIdNumber());
            administratorSignIn.setUserID(administrator.getEmail());
            administratorSignIn.setPassword(administrator.getPassword());
            new AdministratorSignInApiCall().callApiAdministratorSignIn(administratorSignIn);
            return administratorResult;
        } else {
            return null;
        }
    }

    @Override
    public Administrator readAdministrator(Administrator administrator) {
        return null;
    }

    @Override
    public Administrator updateAdministrator(Administrator administrator) {
        return null;
    }

    @Override
    public Administrator deleteAdministrator(Administrator administrator) {
        return null;
    }
}
