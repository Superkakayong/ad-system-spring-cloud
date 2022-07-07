package com.dayong.ad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer // denote this class is an Eureka server
@SpringBootApplication // denote this class is a start program

/**
 * This class is used to deploy single and multiple Eureka Servers.
 * The configuration of servers is in resources/application.yml.
 *
 * You need to add:
 * 127.0.0.1 server1
 * 127.0.0.1 server2
 * 127.0.0.1 server3
 * to /etc/hosts file (use sudo vim /etc/hosts)
 *
 * You can type 127.0.0.1:8000 in your browser to test the connection of multiple Eureka Servers.
 */
public class EurekaApplication {

    public static void main(String[] args) {

        SpringApplication.run(EurekaApplication.class, args);
    }
}
