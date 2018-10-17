package com.verizon.esd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="plans")
public class Plan {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long planId;
	
	private double planSpeed;
	
	private double planUsage;
	
	private double planRate;

	public long getPlanId() {
		return planId;
	}

	public void setPlanId(long planId) {
		this.planId = planId;
	}

	public double getPlanSpeed() {
		return planSpeed;
	}

	public void setPlanSpeed(double planSpeed) {
		this.planSpeed = planSpeed;
	}

	public double getPlanUsage() {
		return planUsage;
	}

	public void setPlanUsage(double planUsage) {
		this.planUsage = planUsage;
	}

	public double getPlanRate() {
		return planRate;
	}

	public void setPlanRate(double planRate) {
		this.planRate = planRate;
	}
	
	
}
