package com.testspringmvc.app.scenario;

import static org.assertj.core.api.Assertions.*;

import com.testspringmvc.app.data.BasicModelBean;
import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;

public class ThenBasicModel extends Stage<ThenBasicModel> {

	@ExpectedScenarioState
	BasicModelBean basicModel;

	public ThenBasicModel the_basic_model_value_is(int value) {
		assertThat(basicModel.getData()).isEqualTo(value);
		return self();
	}
}
