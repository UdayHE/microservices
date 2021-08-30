package io.github.UdayHE.cloudgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by udayhegde
 */
@RestController
public class FallbackController {


    @GetMapping("/userServiceFallback")
    public String userServiceFallBackMethod() {
        return "USER-SERVICE is taking longer time than expected, PLease try again later";
    }

    @GetMapping("/departmentServiceFallback")
    public String departmentServiceFallBackMethod() {
        return "DEPARTMENT-SERVICE is taking longer time than expected, PLease try again later";
    }
}
