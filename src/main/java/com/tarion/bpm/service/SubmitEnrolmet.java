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
//		MunicipalAddress municipalAddress = new MunicipalAddress();
//		municipalAddress.setCity("Toronto");
//		municipalAddress.setPostalCode("M2J0B8");
//		municipalAddress.setStreetName("130 PARKWAY FOREST");
//		municipalAddress.setStreetNo("130");
//		municipalAddress.setSuiteNo("202");
//		
//		ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("registerEnrolment");
//		ObjectValue typedCustomerValue = Variables.objectValue(municipalAddress).serializationDataFormat("application/json").create();
//		runtimeService.setVariable(processInstance.getId(), "customer", typedCustomerValue);
		
		runtimeService.startProcessInstanceByKey("registerEnrolment");
	}

}
