package com.aruna.wcms.email.service;

import com.aruna.wcms.email.model.EmailDetails;
import com.aruna.wcms.email.model.EmailResponse;

public interface EmailService {

    // Method to send simple email
    EmailResponse sendSimpleMail(EmailDetails details);

    // Method to send email with attachment
    EmailResponse sendMailWithAttachment(EmailDetails details);
}
