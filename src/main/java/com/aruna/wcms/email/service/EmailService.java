package com.aruna.wcms.email.service;

import com.aruna.wcms.email.model.EmailDetails;
import com.aruna.wcms.email.model.EmailResponse;
import org.springframework.scheduling.annotation.Async;

public interface EmailService {

    // Method to send simple email
    @Async
    //EmailResponse sendSimpleMail(EmailDetails details);
    void sendSimpleMail(EmailDetails details);

    // Method to send email with attachment
    @Async
    //EmailResponse sendMailWithAttachment(EmailDetails details);
    void sendMailWithAttachment(EmailDetails details);
}
