package com.drools.poc.droolsXlsx.model;

public class ServiceOrigin {

	private Long id;
	private String rule;

	public ServiceOrigin() {
		super();
	}

	public ServiceOrigin(Long id, String rule) {
		super();
		this.id = id;
		this.rule = rule;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRule() {
		return rule;
	}

	public void setRule(String rule) {
		this.rule = rule;
	}

}
