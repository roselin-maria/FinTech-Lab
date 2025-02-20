package com.example.Lab1.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RoseController{
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World";
	}
}