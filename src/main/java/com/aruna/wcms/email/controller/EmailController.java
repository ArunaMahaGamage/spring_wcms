package com.aruna.wcms.email.controller;

import com.aruna.wcms.email.model.EmailDetails;
import com.aruna.wcms.email.model.EmailResponse;
import com.aruna.wcms.email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

@RequestMapping(path="/api/email")
public class EmailController {

    @Autowired
    private EmailService emailService;

    // Send simple email
    @PostMapping("/sendMail")
    public @ResponseBody EmailResponse sendMail(
            @RequestBody EmailDetails details) {

        return emailService.sendSimpleMail(details);
    }

    // Send email with attachment
    @PostMapping("/sendMailWithAttachment")
    public @ResponseBody EmailResponse sendMailWithAttachment(
            @RequestBody EmailDetails details) {

        return emailService
                .sendMailWithAttachment(details);
    }
}
