package com.drools.poc.droolsXlsx.model;

public class BillCalculation {

	private Service service;

	private Long planId;

	private Double value = 0D;

	private BillCalculationEnum billCalculationEnum = BillCalculationEnum.ACTIVE;

	public enum BillCalculationEnum {
		ACTIVE, INACTIVE;
	}

	public BillCalculation(Service service, Long planId) {
		super();
		this.service = service;
		this.planId = planId;
	}

	public BillCalculation() {
		super();
	}

	public Long getPlanId() {
		return planId;
	}

	public void setPlanId(Long planId) {
		this.planId = planId;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public BillCalculationEnum getBillCalculationEnum() {
		return billCalculationEnum;
	}

	public void setBillCalculationEnum(BillCalculationEnum billCalculationEnum) {
		this.billCalculationEnum = billCalculationEnum;
	}

	@Override
	public String toString() {
		return "BillCalculation [service=" + service + ", planId=" + planId + ", value=" + value
				+ ", billCalculationEnum=" + billCalculationEnum + "]";
	}

}
