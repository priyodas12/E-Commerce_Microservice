package EcommerceAppCustomers.api.ui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/e-commercename/market/customers")
public class CustomerController {
	
	@Autowired
	private Environment env;
	
	//status of this controller
	@GetMapping("/status")
	public String getStatus() {
		return "200,OK from "+env.getProperty("local.server.port")+":"+env.getProperty("eureka.instance.instance-id");
	}

}
