package org.notification;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("api/v1/notification")
@RequiredArgsConstructor
public class notificationController {

    private final NotificationService notificationService;

    @PostMapping("create")
    public Notification notify(@RequestBody Notification notification) {
        return this.notificationService.notify(notification);
    }
}
