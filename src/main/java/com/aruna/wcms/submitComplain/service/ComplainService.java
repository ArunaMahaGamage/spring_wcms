package com.aruna.wcms.submitComplain.service;


import com.aruna.wcms.submitComplain.model.Complain;

public interface ComplainService {
    Complain createCitizen(Complain complain);

    Complain readCitizen(Complain complain);

    Complain updateCitizen(Complain complain);

    Complain deleteCitizen(Complain complain);
}
