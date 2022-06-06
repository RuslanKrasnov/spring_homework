package ru.geekbrains.spring_less_web.Model;

import java.util.List;

public interface BuyDao {

    Product findById(Long id);

    List<Product> findAll();

    void deleteById(Long id);

    Product saveOrUpdate(Product product);

    List<Customer> findProductCustomers(Long prodId);

    List<Product> findCustomerProducts(Customer customer);

}
