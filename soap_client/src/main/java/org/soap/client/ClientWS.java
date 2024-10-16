package org.soap.client;

import proxy.Product;
import proxy.ProductWS;
import proxy.ProductWebService;

public class ClientWS {
    public static void main(String[] args) {
        ProductWebService proxy = new ProductWS().getProductWebServicePort();
        System.out.println(proxy.sellingPrice(400.0));
        System.out.println("-----------");
        Product product = proxy.getProduct(1);
        System.out.println(product.getName());
        System.out.println(product.getPrice());

    }
}
