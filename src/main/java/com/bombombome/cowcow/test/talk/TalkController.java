package com.bombombome.cowcow.test.talk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TalkController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
    }
}
