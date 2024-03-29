package com.patika.notificationservice.strategy;

import com.patika.notificationservice.dto.NotificationDTO;
import com.patika.notificationservice.dto.enums.NotificationType;
import org.springframework.stereotype.Component;

@Component
public class SMSNotificationStrategy implements NotificationStrategy {
    @Override
    public void sendNotification(NotificationDTO notificationDTO) {
        // Burada SMS gönderme işlemi gerçekleştirilir
        System.out.println("SMS gönderildi: " + notificationDTO.getMessage() + " - " + notificationDTO.getEmail());
    }

    @Override
    public NotificationType getNotificationType() {
        return NotificationType.SMS;
    }
}
