package edu.cmu.mis.iccfb;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;

import com.netflix.discovery.EurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableEurekaServer
public class Application {
    
    

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
  
  @Autowired
  private EurekaClient discoverClient;
  
  
  
}
