package com.patika.notificationservice.service;

import com.patika.notificationservice.dto.NotificationDTO;
import com.patika.notificationservice.dto.enums.NotificationType;
import com.patika.notificationservice.strategy.NotificationStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class NotificationService {
    private final Map<NotificationType, NotificationStrategy> strategies;

    @Autowired
    public NotificationService(List<NotificationStrategy> strategyList) {
        this.strategies = strategyList.stream()
                .collect(Collectors.toMap(NotificationStrategy::getNotificationType, Function.identity()));
    }

    public void sendNotification(NotificationDTO notificationDTO) {
        NotificationStrategy strategy = strategies.get(notificationDTO.getNotificationType());
        if (strategy == null) {
            throw new IllegalArgumentException("Geçersiz bildirim" + notificationDTO.getNotificationType());
        }
        strategy.sendNotification(notificationDTO);
    }
}
