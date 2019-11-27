package com.drools.poc.drools.xlsx.model;

public class Rule {

	private RuleType ruleType;

	private int quantity;

	public enum RuleType {
		API_BECOMMERCE_ML_ORDER, API_BECOMMERCE_AMZ_ORDER, API_BECOMMERCE_VV_ORDER, DATABASE_BILLING;
	}

	public RuleType getRuleType() {
		return ruleType;
	}

	public void setRuleType(RuleType ruleType) {
		this.ruleType = ruleType;
	}

	public Rule() {
		super();
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
