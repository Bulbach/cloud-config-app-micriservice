package by.alex.cloudConfigAppMicriservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CloudConfigAppMicriserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudConfigAppMicriserviceApplication.class, args);
    }

}
