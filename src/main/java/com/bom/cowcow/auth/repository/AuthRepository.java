package com.bom.cowcow.auth.repository;

import com.bom.cowcow.model.Member;
import com.bom.cowcow.model.QMember;
import com.mysql.cj.QueryResult;
import com.querydsl.core.QueryResults;
import com.querydsl.jpa.impl.JPAQuery;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Slf4j
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

    public List<Member> findOneUser(String username) {
        log.info("repo start");
        QMember qMember = QMember.member;

        List<Member> members = from(qMember).where(qMember.username.eq(username)).fetch();
        log.info("query List: ", members);

        Member member = from(qMember).where(qMember.username.eq(username)).fetchOne();
        log.info("query Member: ", member);

        QueryResults<Member> memberQueryResults = from(qMember).where(qMember.username.eq(username)).fetchResults();
        log.info("query Results: ", memberQueryResults);
        return members;
    }
}
