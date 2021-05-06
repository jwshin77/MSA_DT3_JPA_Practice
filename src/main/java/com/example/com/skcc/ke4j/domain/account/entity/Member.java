package com.example.com.skcc.ke4j.domain.account.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.com.skcc.ke4j.domain.account.enums.Role;
import com.example.com.skcc.ke4j.domain.account.vo.Contact;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "member")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String name;

	@ManyToOne
	@JoinColumn(name = "team_id" )
	private Team team;
	
	@Column
	@Enumerated(EnumType.STRING)
	private Role role;

	@Column(name = "contact")
	@Embedded
	private Contact contact;
	
}
