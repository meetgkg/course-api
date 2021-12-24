package io.javabrains.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello User !!";
	}
	
	@GetMapping("/hi")
	public String hi() {
		return "Hi User !!";
	}

}
