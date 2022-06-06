package ru.geekbrains.springhw7.services;

import org.springframework.stereotype.Service;
import ru.geekbrains.springhw7.data.Product;
import ru.geekbrains.springhw7.repositories.ProductRepository;

import java.util.List;

@Service
public class ProductService {

private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

    public Product findById(Long id) {
        return productRepository.findById(id).orElseThrow();
    }

    public void addProduct(Product product) {
        productRepository.saveAndFlush(product);
    }

    public List<Product> findByCostBetween(Integer min, Integer max) {
        return productRepository.findAllByCostBetween(min, max);
    }
}
