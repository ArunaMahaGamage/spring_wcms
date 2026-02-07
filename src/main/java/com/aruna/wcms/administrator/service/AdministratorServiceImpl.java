package com.aruna.wcms.administrator.service;

import com.aruna.wcms.administrator.model.Administrator;
import com.aruna.wcms.administrator.repository.AdministratorRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AdministratorServiceImpl implements AdministratorService {

    @Autowired
    AdministratorRepository administratorRepository;

    @Override
    public Administrator createAdministrator(Administrator administrator) {
        return administratorRepository.save(administrator);
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
