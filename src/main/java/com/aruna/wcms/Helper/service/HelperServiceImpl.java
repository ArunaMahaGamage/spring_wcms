package com.aruna.wcms.Helper.service;

import com.aruna.wcms.Helper.model.Helper;
import com.aruna.wcms.Helper.repository.HelperRepository;
import com.aruna.wcms.api.email.SentEmail;
import com.aruna.wcms.api.helper.HelperSignInApiCall;
import com.aruna.wcms.driver.model.Driver;
import com.aruna.wcms.email.model.EmailDetails;
import com.aruna.wcms.helperSignIn.model.HelperSignIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
            EmailDetails emailDetails = new EmailDetails();
            emailDetails.setRecipient(helper.getEmail());
            emailDetails.setSubject("Created New User");
            emailDetails.setMsgBody("Hi " + helper.getFirstName() + "\n\n Your Successfully Signup");
            new SentEmail().callApiEmail(emailDetails);
            return HelperResponse;
        } else {
            return null;
        }
    }

    @Override
    public Helper readHelper(Helper helper) {
        Optional<Helper> helperProduct = helperRepository.findByIdNumber(helper.getIdNumber());

        // Handle the Optional result
        if (helperProduct.isPresent()) {
            return helperProduct.get();
        } else {
            // Or throw an exception, return null, etc.
            throw new RuntimeException("Product not found for id :: " + helper.getId());
        }
    }

    @Override
    public Iterable<Helper> readAllHelper() {
        Iterable<Helper> readAllHelperResult = helperRepository.findAll();
        if (readAllHelperResult.iterator().hasNext()) {
            return readAllHelperResult;
        } else {
            // Or throw an exception, return null, etc.
            throw new RuntimeException("Complain is not found.");
        }
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
