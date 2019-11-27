package com.drools.poc.droolsXlsx.configuration;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.drools.decisiontable.DecisionTableProviderImpl;
import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.builder.KieRepository;
import org.kie.api.builder.ReleaseId;
import org.kie.api.io.Resource;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.internal.io.ResourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DroolsConfiguration {

	private KieServices kieServices = KieServices.Factory.get();

	private KieFileSystem getKieFileSystem() throws IOException {
		KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
		List<String> rules = Arrays.asList("rulesContract.xlsx");
		for (String rule : rules) {
			kieFileSystem.write(ResourceFactory.newClassPathResource(rule));
		}
		return kieFileSystem;

	}

	@Bean
	public KieContainer getKieContainer() throws IOException {
		getKieRepository();

		KieBuilder kb = kieServices.newKieBuilder(getKieFileSystem());
		kb.buildAll();

		KieModule kieModule = kb.getKieModule();
		KieContainer kContainer = kieServices.newKieContainer(kieModule.getReleaseId());

		return kContainer;

	}

	private void getKieRepository() {
		final KieRepository kieRepository = kieServices.getRepository();
		kieRepository.addKieModule(new KieModule() {
			public ReleaseId getReleaseId() {
				return kieRepository.getDefaultReleaseId();
			}
		});
	}

	@Bean
	public KieSession getKieSession() {
		
		getKieRepository();
		
		KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
		Resource newClassPathResource = ResourceFactory.newClassPathResource("rulesContract.xlsx");

		DecisionTableProviderImpl decisionTableProvider = new DecisionTableProviderImpl();

		String drl = decisionTableProvider.loadFromResource(newClassPathResource, null);

		System.out.println(drl);

		kieFileSystem.write(newClassPathResource);

		KieBuilder kb = kieServices.newKieBuilder(kieFileSystem);
		kb.buildAll();
		KieModule kieModule = kb.getKieModule();

		KieContainer kContainer = kieServices.newKieContainer(kieModule.getReleaseId());

		return kContainer.newKieSession();

	}

}