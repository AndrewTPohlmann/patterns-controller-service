package com.patterns.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.patterns.core.service.Service;

@RestController
public class Controller {

	@Autowired
	private Service service;

	@RequestMapping("/")
	public String serviceMethod() {
		return service.executeServiceMethod();
	}

}
