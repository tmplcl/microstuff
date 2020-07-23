package com.tmplcl.springer.ping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingResource {

    @GetMapping("/ping")
    public Ping ping() {
        return new Ping();
    }
}
