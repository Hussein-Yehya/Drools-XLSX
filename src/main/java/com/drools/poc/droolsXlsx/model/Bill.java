package com.drools.poc.droolsXlsx.model;

public class Bill {

	private Long id;

	private Long contractId;

	private Status status;

	private Double value = 0D;

	public enum Status {
		PAID, PENDING, PARTIAL, CANCELLED;
	}

	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bill(Long id, Long contractId, Status status, Double value) {
		super();
		this.id = id;
		this.contractId = contractId;
		this.status = status;
		this.value = value;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getContractId() {
		return contractId;
	}

	public void setContractId(Long contractId) {
		this.contractId = contractId;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Bill [id=" + id + ", contractId=" + contractId + ", status=" + status + ", value=" + value + "]";
	}

}
