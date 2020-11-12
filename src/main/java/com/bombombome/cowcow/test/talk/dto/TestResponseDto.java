package com.bombombome.cowcow.test.talk.dto;


import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class TestResponseDto {

    private String name;

    private String email;

    public TestResponseDto() {
        System.out.println("TEST DTO!");
    }
}
