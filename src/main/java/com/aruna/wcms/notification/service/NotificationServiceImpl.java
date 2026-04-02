package com.aruna.wcms.notification.service;

import com.aruna.wcms.notification.model.Notification;
import com.aruna.wcms.notification.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NotificationServiceImpl implements NotificationService {

    @Autowired
    NotificationRepository notificationRepository;

    @Override
    public Notification createWorkFeedback(Notification notification) {
        if (!notification.getIdNumber().isEmpty()) {
            Notification workFeedbackResponse =  notificationRepository.save(notification);
            return workFeedbackResponse;
        } else {
            return null;
        }
    }

    @Override
    public Notification updateNotification(Notification notification) {
        return null;
    }

    @Override
    public Iterable<Notification> readAllNotification() {
        Iterable<Notification> readAllNotificationResult = notificationRepository.findAll();
        if (readAllNotificationResult.iterator().hasNext()) {
            return readAllNotificationResult;
        } else {
            // Or throw an exception, return null, etc.
            throw new RuntimeException("Notification is not found.");
        }
    }

    @Override
    public Iterable<Notification> readAllNotification(Notification notification) {
        Optional<Iterable<Notification>> readAllNotificationResult = notificationRepository.findAllByIdNumber(notification.getIdNumber());
        if (readAllNotificationResult.get().iterator().hasNext()) {
            return readAllNotificationResult.orElse(null);
        } else {
            // Or throw an exception, return null, etc.
            throw new RuntimeException("Notification is not found.");
        }
    }

    @Override
    public Notification readNotification(Notification notification) {
        Optional<Notification> workFeedbackResponse = notificationRepository.findByIdNumber(notification.getIdNumber());

        // Handle the Optional result
        if (workFeedbackResponse.isPresent()) {
            return workFeedbackResponse.get();
        } else {
            // Or throw an exception, return null, etc.
            throw new RuntimeException("Product not found for id :: " + notification.getId());
        }
    }

    @Override
    public Notification deleteNotification(Notification notification) {
        return null;
    }
}
