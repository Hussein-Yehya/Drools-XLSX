package com.drools.poc.drools.xlsx.model;

import java.util.List;

public class Contract {

	private Long id;
	private Long sellerId;
	private List<ServiceAccount> serviceAccounts;
	private List<Addendum> addenda;

	public Contract() {
		super();
	}

	public Contract(Long id, Long sellerId, List<ServiceAccount> serviceAccounts, List<Addendum> addenda) {
		super();
		this.id = id;
		this.sellerId = sellerId;
		this.serviceAccounts = serviceAccounts;
		this.addenda = addenda;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSellerId() {
		return sellerId;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public List<ServiceAccount> getServiceAccounts() {
		return serviceAccounts;
	}

	public void setServiceAccounts(List<ServiceAccount> serviceAccounts) {
		this.serviceAccounts = serviceAccounts;
	}

	public List<Addendum> getAddenda() {
		return addenda;
	}

	public void setAddenda(List<Addendum> addenda) {
		this.addenda = addenda;
	}

}
