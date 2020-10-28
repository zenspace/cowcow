package com.bom.cowcow.auth.repository;


import com.bom.cowcow.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
