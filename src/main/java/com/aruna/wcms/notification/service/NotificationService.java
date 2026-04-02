package com.aruna.wcms.notification.service;

import com.aruna.wcms.notification.model.Notification;

public interface NotificationService {
    Notification createWorkFeedback(Notification notification);

    Notification updateNotification(Notification notification);

    Iterable<Notification> readAllNotification();

    Iterable<Notification> readAllNotification(Notification notification);

    Notification readNotification(Notification notification);

    Notification deleteNotification(Notification notification);
}
