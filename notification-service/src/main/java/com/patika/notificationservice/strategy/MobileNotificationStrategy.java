package com.patika.notificationservice.strategy;

import com.patika.notificationservice.dto.NotificationDTO;
import com.patika.notificationservice.dto.enums.NotificationType;
import org.springframework.stereotype.Component;

@Component
public class MobileNotificationStrategy implements NotificationStrategy {
    @Override
    public void sendNotification(NotificationDTO notificationDTO) {
        // Burada mobil bildirim gönderme işlemi gerçekleştirilir
        System.out.println("Mobil bildirim gönderildi: " + notificationDTO.getMessage() + " - " + notificationDTO.getEmail());
    }

    @Override
    public NotificationType getNotificationType() {
        return NotificationType.MOBILE_NOTIFICATION;
    }
}
