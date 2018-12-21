package net.ddns.freakyvicky.tmserv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication
public class Application extends SpringApplication {

    private static final String LABEL_SERVER_PORT = "server.port";
    private static final String PORT = "8080";

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class)
                .properties(LABEL_SERVER_PORT, PORT)
                .registerShutdownHook(true)
                .run(args);
    }

}
