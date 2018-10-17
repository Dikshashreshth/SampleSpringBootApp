package com.verizon.esd.restapi;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.verizon.esd.model.Plan;
import com.verizon.esd.service.PlanService;

@RestController
@CrossOrigin
@RequestMapping("/plans")
public class PlanApi {

	@Autowired
	public PlanService service;

	@GetMapping
	public ResponseEntity<List<Plan>> getAllPlans() {

		return new ResponseEntity<>(service.getAllPlans(), HttpStatus.OK);

	}

}
