package com.drools.poc.droolsXlsx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DroolsService {

	@Autowired
	private KieSessionService kiesSessionService;

	public void testDatabaseBilling() {
		System.out.println("TESTE DatabaseBilling");

	}

	public void testAmazon() {
		System.out.println("TESTE Amazon");
	}

	public void testMercadoLivre() {
		System.out.println("TESTE MercadoLivre");
	}

	public void testViaVarejo() {
		System.out.println("TESTE ViaVarejo");
	}

	public static void testFixed() {
		System.out.println("TESTE Fixed ");
	}

	public void testUnit() {
		System.out.println("TESTE Unit");
	}

	public void testPercentage() {
		System.out.println("TESTE Percentage");
	}

	public Double testFixedBy(Double value) {
		System.out.println("TEST FIXED  BY VALUE " + value);
		return value + 10D;
	}

}
