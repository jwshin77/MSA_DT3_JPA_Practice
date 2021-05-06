package com.example.com.skcc.ke4j.domain.account.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.com.skcc.ke4j.domain.account.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long>{

	List<Member> findAllMemberByTeamId(Long id);
}
