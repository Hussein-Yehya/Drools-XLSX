package com.drools.poc.droolsXlsx.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class Plan {

	private Long id;
	private String name;

	private List<ServicePrice> servicePrices;

	public Plan() {
		super();
	}

	public Plan(Long id, String name, List<ServicePrice> servicePrices) {
		super();
		this.id = id;
		this.name = name;
		this.servicePrices = servicePrices;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ServicePrice> getServicePrices() {
		return servicePrices;
	}

	public void setServicePrices(List<ServicePrice> servicePrices) {
		this.servicePrices = servicePrices;
	}

	public void teste(Plan plan) {
		System.out.println(plan.getName());
	}

}
