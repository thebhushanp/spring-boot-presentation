package the.bhushan.springboot.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvTestController {

	@Value("${welcome.msg:this is boring default welcome message}")
	private String welcome;
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		return welcome;
	}
}
