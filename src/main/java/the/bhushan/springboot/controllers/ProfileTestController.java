package the.bhushan.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileTestController {

	@Autowired
	Environment env;
	
	@GetMapping("/getdata/profilewise")
	public String getDataProfileWise() {
		String prop = env.getProperty("deployed_at");
		if("linode".equals(prop)) {
			return "fetching original data";
		} else {
			return "fetching dummy data";
		}
	}
}
