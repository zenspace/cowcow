package com.bom.cowcow.auth.repository;

import com.bom.cowcow.model.Member;
import com.bom.cowcow.model.QMember;
import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class AuthRepository extends QuerydslRepositorySupport {
//    @PersistenceContext
//    private EntityManager em;

    /**
     * Creates a new {@link QuerydslRepositorySupport} instance for the given domain type.
     *
     */
    public AuthRepository() {
        super(AuthRepository.class);
    }

    public void findOneUser(String username) {
//        QMember member = new JPAQuery<this.entityManager>();
//        JPAQuery query = new JPAQuery(this.em);
        QMember qMember = QMember.member;

        List<Member> members = from(qMember).where(qMember.username.eq(username)).fetch();


//        List<Member> members = from(member)
//                .where(member.username.eq(username))
    }
}
