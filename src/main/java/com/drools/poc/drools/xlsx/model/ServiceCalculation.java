package com.drools.poc.drools.xlsx.model;

public class ServiceCalculation {

	private Double total;
	private Double value;

	public ServiceCalculation(Double total, Double value) {
		super();
		this.total = total;
		this.value = value;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

}
