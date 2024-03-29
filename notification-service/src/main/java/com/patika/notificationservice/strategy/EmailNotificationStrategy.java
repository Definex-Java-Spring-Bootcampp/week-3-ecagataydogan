package com.patika.notificationservice.strategy;

import com.patika.notificationservice.dto.NotificationDTO;
import com.patika.notificationservice.dto.enums.NotificationType;
import org.springframework.stereotype.Component;

@Component
public class EmailNotificationStrategy implements NotificationStrategy {
    @Override
    public void sendNotification(NotificationDTO notificationDTO) {
        System.out.println("Email gönderildi: " + notificationDTO.getMessage() + " - " + notificationDTO.getEmail());
    }

    @Override
    public NotificationType getNotificationType() {
        return NotificationType.EMAIL;
    }
}
