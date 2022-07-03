package ru.geekbrains.less2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ProductService productService = context.getBean(ProductService.class);
        Cart cart1 = context.getBean(Cart.class);
        cart1.putInCart(1L);
        cart1.putInCart(1L);
        cart1.putInCart(1L);
        cart1.putInCart(2L);
        cart1.putInCart(3L);
        cart1.putInCart(3L);
        cart1.deleteFromCart(1L);
        cart1.deleteFromCart(2L);
        HashMap<Product, Integer> hashMap = cart1.getCartProducts();
        for (Map.Entry<Product, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ", кол-во в тележке: " + entry.getValue());
        }
    }
}
