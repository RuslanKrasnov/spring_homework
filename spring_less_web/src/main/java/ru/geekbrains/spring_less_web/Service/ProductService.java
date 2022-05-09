package ru.geekbrains.spring_less_web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.geekbrains.spring_less_web.Model.Product;
import ru.geekbrains.spring_less_web.Repository.ProductRep;

import java.util.List;

@Component
public class ProductService {
    @Autowired
    private ProductRep productRep;

    public Product getProduct(Long id) {
        return productRep.findById(id);
    }

    public List<Product> getAllProducts() {
        return productRep.getProducts();
    }

}
