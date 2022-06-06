package ru.geekbrains.spring_less_web.Model;

import java.util.List;

public interface CustomerDao {

    Customer findById(Long id);

    List<Customer> findAll();

    void deleteById(Long id);

    Customer saveOrUpdate(Customer customer);

}
