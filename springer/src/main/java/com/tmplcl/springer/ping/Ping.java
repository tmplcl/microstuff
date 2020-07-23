package com.tmplcl.springer.ping;

import lombok.Value;

import java.time.LocalDateTime;

@Value
public class Ping {

    LocalDateTime timestamp = LocalDateTime.now();
    String message = "Pinged!";

}
