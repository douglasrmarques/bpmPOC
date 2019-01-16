package com.tarion.bpm.service;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubmitEnrolmet implements ISubmitEnrolmet {

	@Autowired
	private RuntimeService runtimeService;
	
	@Override
	public void submitEnrolment() {
		runtimeService.startProcessInstanceByKey("registerEnrolment");
	}

}
