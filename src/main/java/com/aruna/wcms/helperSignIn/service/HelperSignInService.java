package com.aruna.wcms.helperSignIn.service;

import com.aruna.wcms.helperSignIn.model.HelperSignIn;

public interface HelperSignInService {

    HelperSignIn creatHelperSignIn(HelperSignIn helper);

    HelperSignIn readHelperSignIn(HelperSignIn helper);

    HelperSignIn updateHelperSignIn(HelperSignIn helper);

    HelperSignIn deleteHelperSignIn(HelperSignIn helper);
}
