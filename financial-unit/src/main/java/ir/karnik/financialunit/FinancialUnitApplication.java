package ir.karnik.financialunit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class FinancialUnitApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinancialUnitApplication.class, args);
    }

}
