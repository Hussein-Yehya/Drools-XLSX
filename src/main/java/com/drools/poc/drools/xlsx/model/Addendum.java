package com.drools.poc.drools.xlsx.model;

import java.util.List;

public class Addendum {

	private Long id;

	private Plan plan;

	private Service service;

	private Double price;

	private Type type;

	public enum Type {
		FIXED, UNIT, PERCENTAGE;
	}

	public Addendum() {
		super();
	}

	public Addendum(Long id, Plan plan, Service service, Double price, Type type, List<String> accountIds) {
		super();
		this.id = id;
		this.plan = plan;
		this.service = service;
		this.price = price;
		this.type = type;
		this.accountIds = accountIds;
	}

	private List<String> accountIds;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public List<String> getAccountIds() {
		return accountIds;
	}

	public void setAccountIds(List<String> accountIds) {
		this.accountIds = accountIds;
	}

}
