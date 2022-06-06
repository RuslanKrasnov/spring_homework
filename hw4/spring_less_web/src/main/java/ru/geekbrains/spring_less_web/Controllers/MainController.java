package ru.geekbrains.spring_less_web.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.spring_less_web.Model.BuyDaoImpl;
import ru.geekbrains.spring_less_web.Model.Customer;
import ru.geekbrains.spring_less_web.Model.Product;
import ru.geekbrains.spring_less_web.Repository.CustomerRepository;
import ru.geekbrains.spring_less_web.Service.CustomerService;
import ru.geekbrains.spring_less_web.Service.ProductService;

import java.util.List;

@RestController
public class MainController {

//    @Autowired
//    private CustomerRepository customerRepository;
    @Autowired
    private BuyDaoImpl buyDaoImpl;
    @Autowired
    private ProductService productService;
    @Autowired
    private CustomerService customerService;

    @GetMapping("/client/all")
    public List<Customer> getTest(){
        return customerService.getAllCustomers();
    }

    @GetMapping("/customers")
    public List<Customer> changeScore(@RequestParam Long prodId){
        return buyDaoImpl.findProductCustomers(prodId);
    }

//    @PostMapping("/client/add")
//    public void addClientPost(@RequestBody Customer customer){
//        customerRepository.addClient(customer);
//    }

    @GetMapping("/product/all")
    public List<Product> getProducts() {
        return productService.getAllProducts();
    }

    @DeleteMapping("/product/delete")
    public void deleteProduct(@RequestParam Long prodId) {
        productService.deleteProduct(prodId);
    }

//    @GetMapping("/product/1")
//    public Product getProduct() {
//        return productService.getProduct(1L);
//    }
}
