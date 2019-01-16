package com.tarion.bpm.adapter;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.tarion.bpm.ProcessConstants;

@Component
@ConfigurationProperties
public class SubmitEnrolmentService implements JavaDelegate {

	@Override
	public void execute(DelegateExecution ctx) throws Exception {
		System.out.println("SubmitEnrolmentService is running");
		ctx.setVariable(ProcessConstants.VARIABLE_paymentTransactionId, "1254");
	}

}
