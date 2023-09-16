package org.openfiegn;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("NOTIFICATIONS")
@Component
public interface NotificationClient {
    @PostMapping("api/v1/notification/create")
    Notification notify(@RequestBody Notification notification);
}




