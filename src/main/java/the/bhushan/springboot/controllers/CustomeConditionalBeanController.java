package the.bhushan.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import the.bhushan.springboot.beans.CustomConditionalBean;

@RestController
public class CustomeConditionalBeanController {

	@Autowired
	CustomConditionalBean customBean;

	@GetMapping("/custombean")
	public String getBeanName() {
		return customBean.getName();
	}
}
