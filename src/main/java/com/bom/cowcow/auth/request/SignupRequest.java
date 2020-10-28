package com.bom.cowcow.auth.request;


import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class SignupRequest {

    @Pattern(regexp = "^[_A-Za-z0-9-]+(\\\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\\\.(?:[A-Z]{2,}|com|org))*$")
    private String email;

    @NotBlank
    private String password;

    @NotBlank
    private String username;
}
