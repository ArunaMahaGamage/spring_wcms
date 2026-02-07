package com.aruna.wcms.Helper.service;

import com.aruna.wcms.Helper.model.Helper;
import com.aruna.wcms.Helper.repository.HelperRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class HelperServiceImpl implements HelperService {

    @Autowired
    HelperRepository helperRepository;

    @Override
    public Helper creatHelper(Helper helper) {
        return null;
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
