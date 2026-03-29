package com.aruna.wcms.email.service;

import com.aruna.wcms.email.model.EmailDetails;

public interface EmailService {

    // Method to send simple email
    String sendSimpleMail(EmailDetails details);

    // Method to send email with attachment
    String sendMailWithAttachment(EmailDetails details);
}
