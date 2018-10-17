package com.verizon.esd.service;


import java.util.List;

import com.verizon.esd.model.Plan;



public interface PlanService {

	Plan getPlanById(long planId);

	List<Plan> getAllPlans();

	

	boolean exists(long planId);
}
