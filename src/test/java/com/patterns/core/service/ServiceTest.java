package com.patterns.core.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.patterns.config.AppConfig;
import com.patterns.core.service.Service;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfig.class })
public class ServiceTest {

	@Autowired
	private Service service;

	@Test
	public void executeSomething() {
		assertEquals("<p><b>Welcome to Spring Boot!</b></p>", service.executeServiceMethod());
	}

}
