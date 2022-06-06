package ru.geekbrains.spring_less_web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.geekbrains.spring_less_web.Model.Customer;
import ru.geekbrains.spring_less_web.Model.CustomerDaoImpl;
import ru.geekbrains.spring_less_web.Model.Product;
import ru.geekbrains.spring_less_web.Model.ProductDaoImpl;
import ru.geekbrains.spring_less_web.Repository.CustomerRepository;

import java.util.List;

@Service
@Component
public class CustomerService {

        @Autowired
        private CustomerDaoImpl customerDaoImpl;

        public Customer getCustomer(Long id) {
            return customerDaoImpl.findById(id);
        }

        public void deleteCustomer(Long id) {
            customerDaoImpl.deleteById(id);
        }

        public List<Customer> getAllCustomers() {
            return customerDaoImpl.findAll();
        }

}
