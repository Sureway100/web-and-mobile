package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//expose rest api
@RestController
public class HelloWorldController {
	
	
	
	//give specify url to rest api
//	@RequestMapping(method = RequestMethod.GET, path = "/hello-world")  ->> method one
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello world";
	}
	
	//lets return hello world in json
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello world");
	}

}
