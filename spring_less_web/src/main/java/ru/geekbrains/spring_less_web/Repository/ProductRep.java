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
                new Product(1L, "milk", 10),
                new Product(2L, "bread", 10),
                new Product(3L, "orange", 10),
                new Product(4L, "juice", 10),
                new Product(5L, "apple", 10)
        ));
    }

    public Product findById(Long id) {
        return productList.stream().filter(p -> p.getId().equals(id)).findFirst().orElseThrow(RuntimeException::new);
    }

    public List<Product> getProducts(){
        return productList;
    }

}
