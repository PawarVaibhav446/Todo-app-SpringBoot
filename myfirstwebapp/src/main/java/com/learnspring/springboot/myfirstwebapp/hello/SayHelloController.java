package com.learnspring.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // -> Web Bean
public class SayHelloController {
	
	@RequestMapping("say-hello") // Mapping URL "say-hello"
	@ResponseBody // -> View
	public String sayHello() {
		return "Hello, What are you Doing ?";
	}
	
	@RequestMapping("say-hello-html") // Mapping URL "say-hello-html"
	@ResponseBody // -> View
	public String sayHelloHTML() {
		
		StringBuffer sb = new StringBuffer();		
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> My First HTML Page </title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("This page is generated using HTML + Spring");
		sb.append("</body>");
		sb.append("</html>");
		
		return sb.toString();
	}
	
	// Path for JSP File
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
}
