package the.bhushan.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import the.bhushan.springboot.beans.MongoBeanTest;

@RestController
public class ProfileWiseBeanController {
	
	@Autowired
	MongoBeanTest mongoBean;

	@GetMapping("/profile/bean")
	public String getBeanName() {
		return mongoBean.getName();
	}
}
