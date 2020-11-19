package com.bom.cowcow.auth.service;

import com.bom.cowcow.auth.repository.MemberRepository;
import com.bom.cowcow.auth.request.SignupRequest;
import com.bom.cowcow.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthService {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private UserService userService;

    public Member signup(String email, String password, String username) {
        Member member = new Member();
        member.setEmail(email);
        member.setPassword(password);
        member.setUsername(username);
        return memberRepository.save(member);
    }

    public Member signup(SignupRequest signupRequest) {
        Member member = new Member();
        member.setEmail(signupRequest.getEmail());
        member.setUsername(signupRequest.getUsername());
        member.setPassword(signupRequest.getPassword());
        return memberRepository.save(member);
    }

    public List<Member> getUserByUsername(String username) {
        return this.userService.getUserByUsername(username);
    }
}
