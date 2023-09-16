package org.fraud;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class FraudController {

    private final JdbcTemplate jdbcTemplate;


    @GetMapping("/fraudCheck")
    public String isWorking() {
        return "hello world!";
    }

}
