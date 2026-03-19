package com.aruna.wcms.Helper.service;

import com.aruna.wcms.Helper.model.Helper;
import com.aruna.wcms.Helper.repository.HelperRepository;
import com.aruna.wcms.api.helper.HelperSignInApiCall;
import com.aruna.wcms.helperSignIn.model.HelperSignIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelperServiceImpl implements HelperService {

    @Autowired
    HelperRepository helperRepository;

    @Override
    public Helper creatHelper(Helper helper) {
        if (!helper.getIdNumber().isEmpty()) {
            Helper HelperResponse =  helperRepository.save(helper);
            HelperSignIn helperSignIn = new HelperSignIn();
            helperSignIn.setIdNumber(helper.getIdNumber());
            helperSignIn.setUserId(helper.getEmail());
            helperSignIn.setPassword(helper.getPassword());
            new HelperSignInApiCall().callApiCreateHelperSignIn(helperSignIn);
            return HelperResponse;
        } else {
            return null;
        }
    }

    @Override
    public Helper readHelper(Helper helper) {
        return null;
    }

    @Override
    public Helper updateHelper(Helper helper) {
        return null;
    }

    @Override
    public Helper deleteHelper(Helper helper) {
        return null;
    }
}
