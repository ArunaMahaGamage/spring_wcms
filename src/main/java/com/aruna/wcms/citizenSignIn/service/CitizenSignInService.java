package com.aruna.wcms.citizenSignIn.service;


import com.aruna.wcms.citizenSignIn.model.CitizenSignIn;

public interface CitizenSignInService {
    CitizenSignIn createCitizen(CitizenSignIn citizenSignIn);

    CitizenSignIn readCitizen(CitizenSignIn citizenSignIn);

    CitizenSignIn updateCitizen(CitizenSignIn citizenSignIn);

    CitizenSignIn deleteCitizen(CitizenSignIn citizenSignIn);
}
