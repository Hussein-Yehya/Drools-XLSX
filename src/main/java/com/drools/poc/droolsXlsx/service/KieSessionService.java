package com.drools.poc.droolsXlsx.service;

import java.util.Objects;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KieSessionService {

	@Autowired
	private KieSession kieSession;

	public <T> T insert(T clazz, String agendaGroup) {
		this.checkAgendaGroupKieSession(agendaGroup);

		kieSession.insert(clazz);
		kieSession.fireAllRules();
		return clazz;
	}

	public void checkAgendaGroupKieSession(String agendaGroup) {
		kieSession.getAgenda().clear();
		if (Objects.nonNull(agendaGroup) && !agendaGroup.isEmpty()) {
			kieSession.getAgenda().getAgendaGroup(agendaGroup).setFocus();
		}

	}

}
