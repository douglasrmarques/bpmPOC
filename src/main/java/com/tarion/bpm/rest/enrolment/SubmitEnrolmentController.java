package com.tarion.bpm.rest.enrolment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tarion.bpm.service.ISubmitEnrolmet;

@RestController
public class SubmitEnrolmentController {

	@Autowired
	private ISubmitEnrolmet isubmitEnrolmet;
	
	@RequestMapping(value = "/submitEnrolment")
	public void submitEnrolment() {
		isubmitEnrolmet.submitEnrolment();
	}

}
