package com.bom.cowcow.auth.controller;

import com.bom.cowcow.auth.request.SignupRequest;
import com.bom.cowcow.auth.service.AuthService;
import com.bom.cowcow.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @GetMapping(value = "/status", produces = "application/json")
    public String status() {
        return "halo";
    }

    @PostMapping(value = "/signup", produces = "application/json")
    public ResponseEntity<Member> signup(@Valid @RequestBody SignupRequest request) {
//        Member newMember = authService.signup("test@test.com", "test", "test");
        Member newMember = authService.signup(request.getEmail(), request.getPassword(), request.getUsername());
        return new ResponseEntity<Member>(newMember,HttpStatus.OK);
    }
}
