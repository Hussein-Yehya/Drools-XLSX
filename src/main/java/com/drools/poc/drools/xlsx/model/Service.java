package com.drools.poc.drools.xlsx.model;

public class Service {

	private Long id;
	private String name;
	private Type type;
	private Double price;
	
	private ServiceOrigin serviceOrigin;

	public enum Type {
		FIXED, UNIT, PERCENTAGE;
	}

	public Service() {
		super();
	}

	public Service(Long id, String name, Type type, Double price, ServiceOrigin serviceOrigin) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
		this.serviceOrigin = serviceOrigin;
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

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public ServiceOrigin getServiceOrigin() {
		return serviceOrigin;
	}

	public void setServiceOrigin(ServiceOrigin serviceOrigin) {
		this.serviceOrigin = serviceOrigin;
	}

}
