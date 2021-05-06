package com.example.com.skcc.ke4j.domain.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.com.skcc.ke4j.domain.account.entity.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long>{

//	getName
	
}
