package com.drools.poc.droolsXlsx.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Customer {

	private String meliId;
	private int years;
	private int discount;
	private String name;
	private PlanType planType;
	private AddOns addOns;
	private String dateStr;
	private DiscountTypes discountType;
	private LocalDate creationDate;

	public enum AddOns {
		AMAZON, VIA_VAREJO, B2W, ALL, AMAZON_AND_B2W, AMAZON_AND_VIA_VAREJO, B2W_AND_VIA_VAREJO;
	}

	public enum DiscountTypes {
		PERCENTAGE, CURRENCY;
	}

	public enum PlanType {
		FREE, STANDARD
	}

	public String getMeliId() {
		return meliId;
	}

	public void setMeliId(String meliId) {
		this.meliId = meliId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		System.out.println("1");
		this.discount = discount;
		System.out.println("1");
	}

	public PlanType getPlanType() {
		return planType;
	}

	public void setPlanType(PlanType planType) {
		this.planType = planType;
	}

	public AddOns getAddOns() {
		return addOns;
	}

	public void setAddOns(AddOns addOns) {
		this.addOns = addOns;
	}

	public String getDateStr() {
		return dateStr;
	}

	public void setDateStr(String dateStr) throws ParseException {
		System.out.println("3");
		
		SimpleDateFormat inFormat = new SimpleDateFormat("dd-MM-yyy");
		Date dtIn = inFormat.parse(dateStr);

		LocalDate localDate = dtIn.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

		this.setCreationDate(localDate);

		this.dateStr = dateStr;
		System.out.println("3");
	}

	public DiscountTypes getDiscountType() {
		return discountType;
	}

	public void setDiscountType(DiscountTypes discountType) {
		System.out.println("2");
		this.discountType = discountType;
		System.out.println("2");
	}

	public LocalDate getCreationDate() {

		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "Customer [meliId=" + meliId + ", years=" + years + ", discount=" + discount + ", name=" + name
				+ ", planType=" + planType + ", addOns=" + addOns + ", log=" + dateStr + ", discountType="
				+ discountType + ", creationDate=" + creationDate + "]";
	}
	
	public void teste(Customer customer) {
		System.out.println("OLHA O CUSTOMER -> " + customer.getName());
	}

}