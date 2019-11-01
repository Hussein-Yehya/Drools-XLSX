package com.drools.poc.droolsXlsx.model;

public class Charge {

	private Double value;
	
	private Double discount;
	
	private String creationDate;
	

	public Double getValue() {
		return value;
	}



	public void setValue(Double value) {
		this.value = value;
	}



	public Double getDiscount() {
		return discount;
	}



	public void setDiscount(Double discount) {
		this.discount = discount;
	}



	public String getCreationDate() {
		return creationDate;
	}



	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}



	@Override
	public String toString() {
		return "Charge [value=" + value + ", discount=" + discount + ", creationDate=" + creationDate + "]";
	}
	
	
	
}
