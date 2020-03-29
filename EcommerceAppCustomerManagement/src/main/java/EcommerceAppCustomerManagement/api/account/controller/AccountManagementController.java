package EcommerceAppCustomerManagement.api.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/e-commercename/market/customer/account")
public class AccountManagementController {
	
	@GetMapping("/status")
	public String getAccountStatusO() {
		return "200,OK";
	}

}
