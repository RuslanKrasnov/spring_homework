package ru.geekbrains.spring_less_web.Repository;

import org.springframework.stereotype.Component;
import ru.geekbrains.spring_less_web.Model.Product;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ProductRep {
    private List<Product> productList;

    @PostConstruct
    public void init() {
        productList = new ArrayList<>(Arrays.asList(
                new Product(1L, "milk", 44),
                new Product(2L, "bread", 37),
                new Product(3L, "orange", 120),
                new Product(4L, "juice", 99),
                new Product(5L, "apple", 110),
                new Product(6L, "potato", 60),
                new Product(7L, "beer", 116),
                new Product(8L, "mushroom", 180),
                new Product(9L, "banana", 121),
                new Product(10L, "bacon", 300)
        ));
    }

    public Product findById(Long id) {
        return productList.stream().filter(p -> p.getId().equals(id)).findFirst().orElseThrow(RuntimeException::new);
    }

    public List<Product> getProducts(){
        return productList;
    }

    public void deleteById(Long id) {
        Product product = findById(id);
        productList.remove(product);
    }
}
