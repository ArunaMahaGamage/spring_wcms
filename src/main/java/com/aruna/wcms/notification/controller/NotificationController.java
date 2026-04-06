package com.aruna.wcms.notification.controller;

import com.aruna.wcms.notification.model.Notification;
import com.aruna.wcms.notification.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

@RequestMapping(path="/api/notification")
public class NotificationController {

    @Autowired
    NotificationService notificationService;

    @PostMapping(path="/create")
    public @ResponseBody Notification createWorkFeedback(@RequestBody Notification notification) {
        return notificationService.createWorkFeedback(notification);
    }

    @PostMapping(path="/update")
    public @ResponseBody Notification updateNotification(@RequestBody Notification notification) {
        return notificationService.updateNotification(notification);
    }

    @PostMapping(path="/read-all")
    public @ResponseBody Iterable<Notification> readAllNotification() {
        return notificationService.readAllNotification();
    }

    @PostMapping(path="/read-all-id")
    public @ResponseBody Iterable<Notification> readAllNotification(@RequestBody Notification notification) {
        return notificationService.readAllNotification(notification);
    }

    @PostMapping(path="/read")
    public @ResponseBody Notification readNotification(@RequestBody Notification notification) {
        return notificationService.readNotification(notification);
    }

    @PostMapping(path="/delete")
    public @ResponseBody Notification deleteNotification(@RequestBody Notification notification) {
        return notificationService.deleteNotification(notification);
    }
}
