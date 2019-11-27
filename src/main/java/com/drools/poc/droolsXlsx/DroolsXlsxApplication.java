package com.drools.poc.droolsXlsx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DroolsXlsxApplication {
	/**
	 * public static void main(String[] args) { Customer customer1 = new Customer();
	 * customer1.setMeliId("1234"); customer1.setName("BESTMIX");
	 * customer1.setYears(4); customer1.setPlanType(PlanType.FREE);
	 * customer1.setAddOns(AddOns.AMAZON);
	 * 
	 * Customer customer2 = new Customer(); customer2.setMeliId("4321");
	 * customer2.setName("3BSHOP"); customer2.setYears(2);
	 * customer2.setPlanType(PlanType.STANDARD); customer2.setAddOns(AddOns.ALL);
	 * 
	 * Charge charge = new Charge();
	 * charge.setCreationDate(LocalDate.now().minusDays(4).format(DateTimeFormatter.ofPattern("dd-MMM-yyyy")));
	 * charge.setValue(100.0);
	 * 
	 * ApplicationContext app = SpringApplication.run(DroolsXlsxApplication.class,
	 * args); KieSessionService kieSessionService =
	 * app.getBean(KieSessionService.class);
	 * 
	 * DroolsConfiguration droolsConfiguration =
	 * app.getBean(DroolsConfiguration.class);
	 * 
	 * droolsConfiguration.getKieSession();
	 * 
	 * System.out.println(kieSessionService.insert(customer1, "Teste"));
	 * 
	 * System.out.println(kieSessionService.insert(customer2, "Fafafa"));
	 * 
	 * System.out.println(kieSessionService.insert(charge, "TesteCharge")); }
	 **/

	public static void main(String[] args) {

		SpringApplication.run(DroolsXlsxApplication.class, args);
	}
}
