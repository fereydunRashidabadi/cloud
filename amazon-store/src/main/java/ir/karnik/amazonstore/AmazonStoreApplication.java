package ir.karnik.amazonstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AmazonStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(AmazonStoreApplication.class, args);
    }

}
