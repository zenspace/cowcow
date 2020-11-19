package com.bom.cowcow.auth.service;

import com.bom.cowcow.auth.repository.AuthRepository;
import com.bom.cowcow.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    AuthRepository authRepository;

    public List<Member> getUserByUsername(String username) {
        return this.authRepository.findOneUser(username);
    }
}
