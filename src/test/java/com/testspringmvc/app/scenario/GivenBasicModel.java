package com.testspringmvc.app.scenario;

import org.springframework.beans.factory.annotation.Autowired;

import com.testspringmvc.app.data.BasicModelBean;
import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import com.tngtech.jgiven.integration.spring.JGivenStage;

@JGivenStage
public class GivenBasicModel extends Stage<GivenBasicModel> {

	@Autowired
	@ProvidedScenarioState
	BasicModelBean basicModel;

	public GivenBasicModel a_basic_model() {
		basicModel.setData(0);
		return self();
	}

}
