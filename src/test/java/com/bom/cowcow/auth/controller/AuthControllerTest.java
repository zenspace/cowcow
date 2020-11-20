package com.bom.cowcow.auth.controller;

import com.bom.cowcow.auth.request.SignupRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
class AuthControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void createUser() throws Exception {
        this.mockMvc.perform(get("/auth/status"))
                .andExpect(status().isOk())
                .andExpect(content().string("halo"));
//                .andExpect(print());
    }

    @Test
    public void 회원가입() throws Exception {
        String content = this.유저생성("test@test.com" , "test", "User_1");
        this.mockMvc.perform(
                post("/auth/signup")
                        .content(content)
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON)
        )
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.username").value("User_1"))
        .andDo(print())
        ;
    }

    private String 유저생성(String email, String password, String username) throws JsonProcessingException {
        SignupRequest request = new SignupRequest();
        request.setEmail(email);
        request.setPassword(password);
        request.setUsername(username);
        String content = objectMapper.writeValueAsString(request);
        return content;
    }


    @AfterEach
    void tearDown() {
    }
}