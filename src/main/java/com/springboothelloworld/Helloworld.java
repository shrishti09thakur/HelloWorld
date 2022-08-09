package com.springboothelloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {
	@GetMapping("/hello")
	public String Hello() {
		return "Hello World";
	}

}
