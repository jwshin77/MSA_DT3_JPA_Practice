package com.example.com.skcc.ke4j.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.com.skcc.ke4j.domain.account.entity.Member;
import com.example.com.skcc.ke4j.service.MemberService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class MemberController {

	private final MemberService memberService;
	
//	@GetMapping("/teams/{{teamId}/members")
	@GetMapping("/teamss/{{teamId}/members")
	public ResponseEntity<List<Member>> finaAllMember (@PathVariable Long teamId) {
		System.out.println(teamId);
		return ResponseEntity.ok().body(memberService.findAllMemberByTeamId(teamId));
	}
	
	@GetMapping("/teams/{teamId}/members")
	public String finaAllMember1 (@PathVariable Long teamId) {
		return memberService.findAllMemberByTeamId(teamId).toString();
	}
	
	
}
