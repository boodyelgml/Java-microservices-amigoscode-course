package org.openfiegn;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("CUSTOMER")
@Component
public interface Customerr {
    @PostMapping("api/v1/customer/create")
    public Customer save(@RequestBody Customer customer);
}
