package payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author gehuadong@163.com
 * @date 2020-03-07 22:40
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentProviderService04Application {

    public static void main(String[] args) {
        SpringApplication.run(PaymentProviderService04Application.class, args);
    }
}
