package com.drools.poc.droolsXlsx.model;

import java.util.List;

public class ServiceAccount {

	private Long planId;

	private Long serviceId;

	private List<String> accountIds;

	public ServiceAccount() {
		super();
	}

	public ServiceAccount(Long planId, Long serviceId, List<String> accountIds) {
		super();
		this.planId = planId;
		this.serviceId = serviceId;
		this.accountIds = accountIds;
	}

	public Long getPlanId() {
		return planId;
	}

	public void setPlanId(Long planId) {
		this.planId = planId;
	}

	public Long getServiceId() {
		return serviceId;
	}

	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}

	public List<String> getAccountIds() {
		return accountIds;
	}

	public void setAccountIds(List<String> accountIds) {
		this.accountIds = accountIds;
	}

}
