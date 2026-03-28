package com.aruna.wcms.submitComplain.service;


import com.aruna.wcms.submitComplain.model.Complain;

import java.util.List;

public interface ComplainService {
    Complain createComplain(Complain complain);

    Iterable<Complain> readAllComplain();

    Iterable<Complain> readAllComplainByCitizenIDNumber(Complain complain);

    Complain readComplain(Complain complain);

    Complain updateComplain(Complain complain);

    Complain deleteComplain(Complain complain);
}
