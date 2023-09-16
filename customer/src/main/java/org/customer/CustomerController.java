package org.customer;

import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.openfiegn.FraudClient;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final FraudClient fraudClient;
    private final CustomerService customerService;

    @GetMapping("{id}")
    public void getCustomer(@PathParam("id") Long id) {
        customerService.getCustomer(id);
        System.out.println(id);
    }

    @PostMapping("create")
    public Customer save(@RequestBody Customer customer) {
        return customerService.create(customer);
    }

    @GetMapping("checkfraud")
    public void checkfraud() {
        fraudClient.isWorking();
    }
}
