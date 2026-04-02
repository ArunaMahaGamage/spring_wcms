package com.aruna.wcms.notification.repository;

import com.aruna.wcms.notification.model.Notification;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface NotificationRepository extends CrudRepository<Notification, Integer> {

    Optional<Notification> findByIdNumber(String idNumber);

    Optional<Iterable<Notification>> findAllByIdNumber(String idNumber);
}
