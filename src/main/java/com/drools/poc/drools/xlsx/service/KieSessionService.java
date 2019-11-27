package com.drools.poc.drools.xlsx.service;

import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KieSessionService {

	@Autowired
	private KieSession kieSession;

	public <T> void fireAllRules(List<T> clazz, String agendaGroup, Map<String, Object> globalVariables) {

		kieSession.getKieBase().newKieSession();

		this.checkAgendaGroupKieSession(agendaGroup);

		this.checkGlobalVariables(globalVariables);

		clazz.forEach(c -> kieSession.insert(c));

		kieSession.fireAllRules();

		kieSession.dispose();

	}

	private void checkGlobalVariables(Map<String, Object> globalVariables) {

		if (Objects.nonNull(globalVariables)) {
			globalVariables.forEach(kieSession::setGlobal);
		}
	}

	public void checkAgendaGroupKieSession(String agendaGroup) {
		kieSession.getAgenda().clear();
		if (Objects.nonNull(agendaGroup) && !agendaGroup.isEmpty()) {
			kieSession.getAgenda().getAgendaGroup(agendaGroup).setFocus();
		}

	}

}
