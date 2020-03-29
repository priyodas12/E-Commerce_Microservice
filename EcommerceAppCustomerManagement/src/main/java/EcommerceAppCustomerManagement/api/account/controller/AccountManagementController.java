package EcommerceAppCustomerManagement.api.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/e-commercename/market/customer/account")
public class AccountManagementController {
	
	@Autowired
	private Environment env;
	
	@GetMapping("/status")
	public String getAccountStatusO() {
		return "200,OK from "+env.getProperty("local.server.port")+":"+env.getProperty("eureka.instance.instance-id");
	}

}
