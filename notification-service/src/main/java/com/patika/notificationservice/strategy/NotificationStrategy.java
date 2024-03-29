package com.patika.notificationservice.strategy;

import com.patika.notificationservice.dto.NotificationDTO;
import com.patika.notificationservice.dto.enums.NotificationType;

public interface NotificationStrategy {
    void sendNotification(NotificationDTO notificationDTO);
    NotificationType getNotificationType();
}
