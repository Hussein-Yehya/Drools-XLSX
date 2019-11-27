package com.drools.poc.droolsXlsx.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drools.poc.droolsXlsx.model.Addendum;
import com.drools.poc.droolsXlsx.model.Bill;
import com.drools.poc.droolsXlsx.model.Bill.Status;
import com.drools.poc.droolsXlsx.model.BillCalculation;
import com.drools.poc.droolsXlsx.model.BillCalculation.BillCalculationEnum;
import com.drools.poc.droolsXlsx.model.Plan;
import com.drools.poc.droolsXlsx.model.Rule;
import com.drools.poc.droolsXlsx.model.Service;
import com.drools.poc.droolsXlsx.model.Service.Type;
import com.drools.poc.droolsXlsx.model.ServiceOrigin;
import com.drools.poc.droolsXlsx.model.ServicePrice;
import com.drools.poc.droolsXlsx.service.DroolsService;
import com.drools.poc.droolsXlsx.service.KieSessionService;

@RestController
public class DroolsController {

	@Autowired
	private KieSessionService kiesSessionService;

	@Autowired
	private DroolsService droolsService;

	private String api;

	public String getApi() {
		return api;
	}

	public void setApi(String api) {
		this.api = api;
	}

	@SuppressWarnings("rawtypes")
	@GetMapping("/service-price")
	public ResponseEntity servicePriceDrools() {

		/**
		 * Dado um ServicePrice, o Drools saberá qual é o valor que deverá ser inserido
		 * de acordo com o planoId e ServiceId
		 */

		List<ServicePrice> servicePrices = new ArrayList<>();

		Plan plan = new Plan(1L, "Mercado Livre", servicePrices);

		ServiceOrigin serviceOriginVV = new ServiceOrigin(1L, "VV API [GET] PEDIDO");
		ServiceOrigin serviceOriginAmazon = new ServiceOrigin(2L, "AMZ API [GET] PEDIDO");
		ServiceOrigin serviceOriginML = new ServiceOrigin(3L, "ML API [GET] PEDIDO");

		Service servicePedidoMeli = new Service(1L, "Pedidos Meli", Type.FIXED, 199D, serviceOriginML);
		Service servicePedidoAmazon = new Service(2L, "Pedidos Amazon", Type.UNIT, 0.9D, serviceOriginAmazon);
		Service servicePedidoViaVarejo = new Service(3L, "Pedidos Via Varejo", Type.PERCENTAGE, 30D, serviceOriginVV);

		servicePrices.add(new ServicePrice(1L, servicePedidoMeli, 199D));
		servicePrices.add(new ServicePrice(2L, servicePedidoAmazon, 0.9D));
		servicePrices.add(new ServicePrice(3L, servicePedidoViaVarejo, 30D));

		plan.setServicePrices(servicePrices);

		// servicePrices.forEach(sp -> kiesSessionService.fireAllRules(sp,
		// "ServiceOrigin", null));

		return ResponseEntity.ok(plan);
	}

	@SuppressWarnings("rawtypes")
	@GetMapping("/service")
	public ResponseEntity serviceDrools() {

		ServiceOrigin serviceOrigin = new ServiceOrigin(3L, "VV API [GET] PEDIDO");

		Service service = new Service(2L, "Pedido VV", Type.UNIT, 0.6D, serviceOrigin);

		Rule rule = new Rule();

		Map<String, Object> globalVariablesMap = new HashMap<>();
		globalVariablesMap.put("rule", rule);
		globalVariablesMap.put("droolsService", droolsService);

		// kiesSessionService.fireAllRules(service, "ServiceOrigin",
		// globalVariablesMap);

		return ResponseEntity.ok(service);
	}

	@SuppressWarnings("rawtypes")
	@GetMapping("/bills")
	public ResponseEntity billsDrools() {

		List<ServicePrice> servicePrices = new ArrayList<>();

		ServiceOrigin serviceOriginVV = new ServiceOrigin(1L, "VV API [GET] PEDIDO");
		ServiceOrigin serviceOriginAmazon = new ServiceOrigin(2L, "AMZ API [GET] PEDIDO");
		ServiceOrigin serviceOriginML = new ServiceOrigin(3L, "ML API [GET] PEDIDO");

		Service servicePedidoMeli = new Service(1L, "Pedidos Meli", Type.FIXED, 199D, serviceOriginML);
		Service servicePedidoAmazon = new Service(2L, "Pedidos Amazon", Type.UNIT, 0.9D, serviceOriginAmazon);
		Service servicePedidoViaVarejo = new Service(3L, "Pedidos Via Varejo", Type.PERCENTAGE, 30D, serviceOriginVV);

		servicePrices.add(new ServicePrice(1L, servicePedidoMeli, 199D));
		servicePrices.add(new ServicePrice(2L, servicePedidoAmazon, 0.9D));
		servicePrices.add(new ServicePrice(3L, servicePedidoViaVarejo, 30D));

		servicePrices.stream().forEach(s -> {
			System.err.println(s.toString());
		});

		Map<String, Object> globalVariablesMap = new HashMap<>();
		globalVariablesMap.put("droolsService", droolsService);

//		servicePrices.stream().forEach(s -> kiesSessionService.fireAllRules(s, "ServicePrice", globalVariablesMap));

		return ResponseEntity.ok().build();
	}

	@SuppressWarnings("rawtypes")
	@GetMapping("/function")
	public ResponseEntity testeFunciotn() {

		List<ServicePrice> servicePrices = new ArrayList<>();

		ServiceOrigin serviceOriginVV = new ServiceOrigin(1L, "VV API [GET] PEDIDO");
		ServiceOrigin serviceOriginAmazon = new ServiceOrigin(2L, "AMZ API [GET] PEDIDO");
		ServiceOrigin serviceOriginML = new ServiceOrigin(3L, "ML API [GET] PEDIDO");

		Service servicePedidoMeli = new Service(1L, "Pedidos Meli", Type.FIXED, 199D, serviceOriginML);
		Service servicePedidoAmazon = new Service(2L, "Pedidos Amazon", Type.FIXED, 0.9D, serviceOriginAmazon);
		Service servicePedidoViaVarejo = new Service(3L, "Pedidos Via Varejo", Type.PERCENTAGE, 30D, serviceOriginVV);

		servicePrices.add(new ServicePrice(1L, servicePedidoMeli, 10.0D));
		servicePrices.add(new ServicePrice(2L, servicePedidoAmazon, 30.0D));
		servicePrices.add(new ServicePrice(3L, servicePedidoViaVarejo, 20.0D));

		List<BillCalculation> billCalculations = new ArrayList<>();

		Map<String, Object> globalVariablesMap = new HashMap<>();
		globalVariablesMap.put("droolsService", droolsService);

		List<Object> clazz = new ArrayList<>();

		servicePrices.stream().forEach(sp -> {
			clazz.add(sp);

			BillCalculation billCalculation = new BillCalculation();

			clazz.add(billCalculation);
			
			kiesSessionService.fireAllRules(clazz, "serviceCalculation", globalVariablesMap);

			System.out.println("########" + billCalculation.toString());
			
			billCalculations.add(billCalculation);

			clazz.remove(sp);
			clazz.remove(billCalculation);
		});
		

		return ResponseEntity.ok(billCalculations.get(0));
	}

}
