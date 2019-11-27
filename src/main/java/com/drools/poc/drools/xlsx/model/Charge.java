package com.drools.poc.drools.xlsx.model;

public class Charge {

	private Long id;

	private Long billId;

	private Double value;

	private Double paidValue;

	private Status status;

	public enum Status {
		PAID, PENDING, PARTIAL, CANCELLED;
	}

	public Charge(Long id, Long billId, Double value, Double paidValue, Status status) {
		super();
		this.id = id;
		this.billId = billId;
		this.value = value;
		this.paidValue = paidValue;
		this.status = status;
	}

	public Charge() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBillId() {
		return billId;
	}

	public void setBillId(Long billId) {
		this.billId = billId;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Double getPaidValue() {
		return paidValue;
	}

	public void setPaidValue(Double paidValue) {
		this.paidValue = paidValue;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
