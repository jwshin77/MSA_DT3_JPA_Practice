package com.example.com.skcc.ke4j.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.com.skcc.ke4j.domain.account.entity.Member;
import com.example.com.skcc.ke4j.domain.account.repository.MemberRepository;
import com.example.com.skcc.ke4j.service.MemberService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MemberServiceImpl implements MemberService {

	//Bean Injection
	private final MemberRepository memberRepository;
	
	@Override
	public List<Member> findAllMemberByTeamId(Long id) {
		return memberRepository.findAllMemberByTeamId(id);
	}

}
