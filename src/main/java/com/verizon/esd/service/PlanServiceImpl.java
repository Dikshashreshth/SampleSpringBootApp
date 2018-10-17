package com.verizon.esd.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.verizon.esd.dao.PlanRepository;

import com.verizon.esd.model.Plan;

@Service
public class PlanServiceImpl implements PlanService {

	@Autowired
	private PlanRepository planRepo;

	@Override
	public Plan getPlanById(long planId) {
		
		Plan p = null;

		Optional<Plan> optp = planRepo.findById(planId);

		if (optp.isPresent()) {
			p = optp.get();
		}
		return p;
		
	}

	@Override
	public List<Plan> getAllPlans() {
		
		return planRepo.findAll();
		
	}

	@Override
	public boolean exists(long planId) {
		return planRepo.existsById(planId);
		
	}

	

}
