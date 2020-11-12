package com.bombombome.cowcow.test.talk.service;

import com.bombombome.cowcow.test.talk.dto.TalkResponseDto;
import com.bombombome.cowcow.test.talk.model.Users;
import com.bombombome.cowcow.test.talk.repository.TalkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TalkService {

    @Autowired
    TalkRepository talkRepository;


    public void UserSave(TalkResponseDto talkResponseDto) {
        Users user = new Users();
        user.name = talkResponseDto.getName();
        user.email = talkResponseDto.getEmail();
        talkRepository.save(user);
    }
}
