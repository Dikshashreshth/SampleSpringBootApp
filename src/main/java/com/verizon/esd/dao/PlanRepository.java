package com.verizon.esd.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import com.verizon.esd.model.Plan;



@Repository
public interface PlanRepository extends JpaRepository<Plan, Long> {

	
}
