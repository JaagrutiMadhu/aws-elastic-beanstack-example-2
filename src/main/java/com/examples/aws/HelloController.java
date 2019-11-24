package com.examples.aws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    public String sayhello() {
        return "Hello My Family";
    }
}
