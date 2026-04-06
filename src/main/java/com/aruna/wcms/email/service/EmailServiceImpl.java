package com.aruna.wcms.email.service;

import com.aruna.wcms.email.model.EmailDetails;
import com.aruna.wcms.email.model.EmailResponse;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import java.io.File;

import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    private EmailResponse emailResponse;

    @Value("${spring.mail.username}")
    private String sender;


    /*@Override
    public EmailResponse sendSimpleMail(EmailDetails details) {
        emailResponse = new EmailResponse();
        try {

            SimpleMailMessage mailMessage =
                    new SimpleMailMessage();

            mailMessage.setFrom(sender);
            mailMessage.setTo(details.getRecipient());
            mailMessage.setText(details.getMsgBody());
            mailMessage.setSubject(details.getSubject());

            javaMailSender.send(mailMessage);

            emailResponse.setStatus(200);
            emailResponse.setMessage("Mail Sent Successfully");
            return emailResponse;

        } catch (Exception e) {

            emailResponse.setStatus(500);
            emailResponse.setMessage("Error while sending mail");
            return emailResponse;
        }
    }

    @Override
    public EmailResponse sendMailWithAttachment(EmailDetails details) {
        MimeMessage mimeMessage =
                javaMailSender.createMimeMessage();

        MimeMessageHelper helper;

        emailResponse = new EmailResponse();

        try {

            helper =
                    new MimeMessageHelper(mimeMessage, true);

            helper.setFrom(sender);
            helper.setTo(details.getRecipient());
            helper.setText(details.getMsgBody());
            helper.setSubject(details.getSubject());

            FileSystemResource file =
                    new FileSystemResource(
                            new File(details.getAttachment()));

            helper.addAttachment(
                    file.getFilename(), file);

            javaMailSender.send(mimeMessage);

            emailResponse.setStatus(200);
            emailResponse.setMessage("Mail Sent Successfully");
            return emailResponse;

        } catch (MessagingException e) {

            emailResponse.setStatus(500);
            emailResponse.setMessage("Error while sending mail");
            return emailResponse;
        }
    }*/

    @Override
    public void sendSimpleMail(EmailDetails details) {
        emailResponse = new EmailResponse();
        try {

            SimpleMailMessage mailMessage =
                    new SimpleMailMessage();

            mailMessage.setFrom(sender);
            mailMessage.setTo(details.getRecipient());
            mailMessage.setText(details.getMsgBody());
            mailMessage.setSubject(details.getSubject());

            javaMailSender.send(mailMessage);

            emailResponse.setStatus(200);
            emailResponse.setMessage("Mail Sent Successfully");
            //return emailResponse;

        } catch (Exception e) {

            emailResponse.setStatus(500);
            emailResponse.setMessage("Error while sending mail");
            //return emailResponse;
        }
    }

    @Override
    public void sendMailWithAttachment(EmailDetails details) {
        MimeMessage mimeMessage =
                javaMailSender.createMimeMessage();

        MimeMessageHelper helper;

        emailResponse = new EmailResponse();

        try {

            helper =
                    new MimeMessageHelper(mimeMessage, true);

            helper.setFrom(sender);
            helper.setTo(details.getRecipient());
            helper.setText(details.getMsgBody());
            helper.setSubject(details.getSubject());

            FileSystemResource file =
                    new FileSystemResource(
                            new File(details.getAttachment()));

            helper.addAttachment(
                    file.getFilename(), file);

            javaMailSender.send(mimeMessage);

            emailResponse.setStatus(200);
            emailResponse.setMessage("Mail Sent Successfully");
            //return emailResponse;

        } catch (MessagingException e) {

            emailResponse.setStatus(500);
            emailResponse.setMessage("Error while sending mail");
            //return emailResponse;
        }
    }
}
