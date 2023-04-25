package com.sajib.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

	//"say-hello" =>"hello! what are you learning today?"
	
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello what are you learning today?";
	}
}
