package com.example.demo;

import com.example.demo.repositories.ProductRepository;
import com.example.demo.webservice.ProductWebService;
import jakarta.xml.ws.Endpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {


    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        ProductWebService productWebService = context.getBean(ProductWebService.class);

        String url = "http://localhost:8088/";
        Endpoint.publish(url, productWebService);
        System.out.println(url + " deployed successfully");


    }

}
