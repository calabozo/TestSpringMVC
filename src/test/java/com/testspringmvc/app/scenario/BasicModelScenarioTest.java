package com.testspringmvc.app.scenario;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.testspringmvc.app.config.TestSpringConfig;
import com.tngtech.jgiven.integration.spring.SpringScenarioTest;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestSpringConfig.class)
public class BasicModelScenarioTest
extends SpringScenarioTest<GivenBasicModel, WhenBasicModel, ThenBasicModel> {

	@Test
	public void basic_model_stores_the_given_value() {
		int value = 5;
		given().a_basic_model();
		when().set_$_as_data_value(value);
		then().the_basic_model_value_is(value);
	}
};