package com.psp.jaxrs.greeting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {
	
	
	@RequestMapping(value="/greet/{user}", method=RequestMethod.GET)
	public @ResponseBody String greetUser(@PathVariable("user") String userName, @RequestParam(value="loc") String location){
		
		String greetingMessage="Hello "+userName+" from " +location+", Welcome to Spring!";
		return greetingMessage;
	}

}
