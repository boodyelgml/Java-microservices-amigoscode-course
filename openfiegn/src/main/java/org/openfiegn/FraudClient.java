package org.openfiegn;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("FRAUD")
@Component
public interface FraudClient {
    @GetMapping("api/v1/fraudCheck")
    String isWorking();
}
