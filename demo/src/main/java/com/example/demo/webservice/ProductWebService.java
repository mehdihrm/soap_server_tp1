package com.example.demo.webservice;

import com.example.demo.models.Product;
import com.example.demo.repositories.ProductRepository;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@WebService(serviceName = "ProductWS")
@Service
@AllArgsConstructor @NoArgsConstructor
public class ProductWebService {
    @Autowired
    ProductRepository productRepository;

    @WebMethod(operationName = "sellingPrice")
    public Double sellingPrice(@WebParam(name = "Price") Double price){
        return price * 1.5;
    }
    @WebMethod
    public Product getProduct(Integer id){
        return productRepository.findById(id).orElse(null);
    }
    @WebMethod
    public List<Product> getAllProducts(){
        productRepository.save(Product.builder().name("ASUS ROG STRIX")
                        .dateCreation(new Date())
                        .price(12000.0)
                .build());
        return productRepository.findAll();
    }
}
