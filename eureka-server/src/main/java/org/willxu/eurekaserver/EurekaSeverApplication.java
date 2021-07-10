package org.willxu.eurekaserver;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaSeverApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaSeverApplication.class).web(WebApplicationType.SERVLET).run(args);
    }
}
