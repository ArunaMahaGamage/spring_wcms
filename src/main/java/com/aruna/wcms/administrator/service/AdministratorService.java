package com.aruna.wcms.administrator.service;


import com.aruna.wcms.administrator.model.Administrator;

public interface AdministratorService {
    Administrator createAdministrator(Administrator administrator);

    Administrator readAdministrator(Administrator administrator);

    Administrator updateAdministrator(Administrator administrator);

    Administrator deleteAdministrator(Administrator administrator);
}
