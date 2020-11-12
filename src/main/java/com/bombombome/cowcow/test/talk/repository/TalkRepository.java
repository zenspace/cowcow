package com.bombombome.cowcow.test.talk.repository;

import com.bombombome.cowcow.test.talk.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TalkRepository extends JpaRepository<Users, Long> {
}
