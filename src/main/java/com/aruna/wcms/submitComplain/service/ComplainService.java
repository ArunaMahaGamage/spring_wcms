package com.aruna.wcms.submitComplain.service;


import com.aruna.wcms.submitComplain.model.Complain;

public interface ComplainService {
    Complain createComplain(Complain complain);

    Complain readComplain(Complain complain);

    Complain updateComplain(Complain complain);

    Complain deleteComplain(Complain complain);
}
