package com.testspringmvc.app.data;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.testspringmvc.app.data.BasicModelBean;
import com.testspringmvc.app.data.ApplicationFactoryBean;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationFactoryBean.class, loader = AnnotationConfigContextLoader.class)
public class BasicModelBeanTest {
	@Autowired
	BasicModelBean basicModel;
	@Test
	public void testSetDataValue() {
		Assert.assertEquals(basicModel.getData(), 1);
		basicModel.setData(2);
		Assert.assertEquals(basicModel.getData(), 2);
	}
}
