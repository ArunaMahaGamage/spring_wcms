package com.aruna.wcms.Helper.service;

import com.aruna.wcms.Helper.model.Helper;

public interface HelperService {
    Helper creatHelper(Helper helper);

    Helper readHelper(Helper helper);

    Helper updateHelper(Helper helper);

    Helper deleteHelper(Helper helper);
}
