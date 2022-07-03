package ru.geekbrains.less2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Component
@Scope("prototype")
public class Cart {
    @Autowired
    private HashMap<Product, Integer> cartProducts;
    @Autowired
    private ProductService productService;

    public void putInCart(Long id){
        Product product = productService.getProduct(id);
        if (cartProducts.containsKey(product)) {
            cartProducts.replace(product, cartProducts.get(product), cartProducts.get(product) + 1);
        } else {
            cartProducts.put(productService.getProduct(id), 1);
        }
    }

    public void deleteFromCart(Long id) {
        Product product = productService.getProduct(id);
        if (cartProducts.containsKey(product)) {
            if (cartProducts.get(product) == 1){
                cartProducts.remove(product);
            } else {
                cartProducts.replace(product, cartProducts.get(product), cartProducts.get(product) - 1);
            }
        }
    }

    public HashMap<Product, Integer> getCartProducts() {
        return cartProducts;
    }
}
