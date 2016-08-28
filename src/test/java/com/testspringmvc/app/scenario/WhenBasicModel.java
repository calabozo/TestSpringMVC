package com.testspringmvc.app.scenario;

import com.testspringmvc.app.data.BasicModelBean;
import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;

public class WhenBasicModel extends Stage<WhenBasicModel> {

	@ExpectedScenarioState
	BasicModelBean basicModel;

	public WhenBasicModel set_$_as_data_value(int value) {
		basicModel.setData(value);
		return self();
	}
}
