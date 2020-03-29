package EcommerceAppZuulApiGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableDiscoveryClient
@SpringBootApplication
@EnableZuulProxy
public class EcommerceAppZuulApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceAppZuulApiGatewayApplication.class, args);
	}

}
