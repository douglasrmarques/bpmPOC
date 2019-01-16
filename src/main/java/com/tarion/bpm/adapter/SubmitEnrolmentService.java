package com.tarion.bpm.adapter;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class SubmitEnrolmentService implements JavaDelegate {
	
	@Override
	public void execute(DelegateExecution ctx) throws Exception {
		System.out.println("SubmitEnrolmentService is running");
	}

}
