package EcommerceAppCustomers.api.ui.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/e-commercename/market/customers")
public class CustomerController {
	
	@GetMapping("/status")
	public String getStatus() {
		return "200,OK";
	}

}
