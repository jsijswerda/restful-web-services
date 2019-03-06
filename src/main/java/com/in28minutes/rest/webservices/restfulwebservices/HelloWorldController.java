package com.in28minutes.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@GetMapping(path="/hello-world")
	public String StringhelloWorld() {
		return "Hello World";
	}


		@GetMapping(path="/hello-world-bean")
		public HelloWorldBean StringhelloWorldBean() {
			return new HelloWorldBean("Hello World");
		}


}
