package com.aruna.wcms.administratorSignIn.service;


import com.aruna.wcms.administratorSignIn.model.AdministratorSignIn;

public interface AdministratorSignInService {
    AdministratorSignIn createCitizen(AdministratorSignIn administratorSignIn);

    AdministratorSignIn readCitizen(AdministratorSignIn administratorSignIn);

    AdministratorSignIn updateCitizen(AdministratorSignIn administratorSignIn);

    AdministratorSignIn deleteCitizen(AdministratorSignIn administratorSignIn);
}
