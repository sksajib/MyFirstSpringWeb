package com.sajib.springboot.myfirstwebapp.loginwithparam;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


//ModelMap is used to get any parameters which need to be available in JSP

@Controller
public class LoginWithParamController {
	
	//private Logger logger=LoggerFactory.getLogger(getClass());
	@RequestMapping("login-with-param")
	public String login(@RequestParam String name,ModelMap model) {
		model.put("name", name);
		//logger.debug("requerst Param is {}", name);
		//logger.info("I want this printed at info level");
		System.out.println("Request param is "+ name); //not Recommended
		return "loginWithParam";
	}
}
