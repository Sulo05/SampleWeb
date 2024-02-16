package com.scope.testweb;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class SampleWebController {
	
	@GetMapping(path="/get")
	public String getMethodName() {
		return "Helloo";
	}
	

}
