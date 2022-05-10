package com.wipro.velocity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class HelloWorldController {

	//Executed with RestController Annotation-http://localhost:8080/hello
	@GetMapping("/hello")
    public String sayHello()
    {
        return "Hello World from Spring Boot";
    }
	
	//Mapping for root -http://localhost:9090
	 @GetMapping("/")
     public String index() {
        return "index"; //Returns view index.jsp
     }
    
	 
     @PostMapping("/test")
     public String sayHello(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";   //returns view + model(data)
     }
}	