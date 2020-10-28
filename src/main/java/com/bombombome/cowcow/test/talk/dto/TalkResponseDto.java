package com.bombombome.cowcow.test.talk.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class TalkResponseDto {

    private final String name;
    private final int amount;
}
