package com.example.com.skcc.ke4j.service;

import java.util.List;

import com.example.com.skcc.ke4j.domain.account.entity.Member;

public interface MemberService{

	List<Member> findAllMemberByTeamId(Long id);
}
