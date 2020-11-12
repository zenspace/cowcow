package com.bombombome.cowcow.test.talk.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class TalkResponseDto extends TestResponseDto {

    @NotBlank
    private String name;

    @NotBlank
    private String email;

    public TalkResponseDto() {
        System.out.println("TalkResponseDto");
    }

}
