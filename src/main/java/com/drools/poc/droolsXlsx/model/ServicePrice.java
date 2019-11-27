package com.drools.poc.droolsXlsx.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class ServicePrice {

	private Long id;
	private Service service;
	private Double price;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public ServicePrice(Long id, Service service, Double price) {
		super();
		this.id = id;
		this.service = service;
		this.price = price;
	}

	@Override
	public String toString() {
		return "ServicePrice [id=" + id + ", service=" + service + ", price=" + price + "]";
	}

}
