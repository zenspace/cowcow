package com.bombombome.cowcow.test.talk;

import com.bombombome.cowcow.test.talk.dto.TalkResponseDto;
import com.bombombome.cowcow.test.talk.service.TalkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class TalkController {

    @Autowired
    TalkService talkService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
    }

    @PostMapping(value="/test2", produces = "application/json")
    public String test2(@Valid @RequestBody TalkResponseDto talkResponseDto) {
        talkService.UserSave(talkResponseDto);
        return "Hello post";
    }
}
