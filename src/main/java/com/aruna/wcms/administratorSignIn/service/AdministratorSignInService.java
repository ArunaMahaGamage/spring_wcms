package com.aruna.wcms.administratorSignIn.service;


import com.aruna.wcms.administratorSignIn.model.AdministratorSignIn;

public interface AdministratorSignInService {
    AdministratorSignIn createAdministratorSignIn(AdministratorSignIn administratorSignIn);

    AdministratorSignIn readAdministratorSignIn(AdministratorSignIn administratorSignIn);

    AdministratorSignIn updateAdministratorSignIn(AdministratorSignIn administratorSignIn);

    AdministratorSignIn deleteAdministratorSignIn(AdministratorSignIn administratorSignIn);
}
