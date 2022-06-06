package ru.geekbrains.spring_less_web.Repository;

import org.springframework.stereotype.Component;
import ru.geekbrains.spring_less_web.Model.Customer;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class CustomerRepository {

//    private List<Customer> customerList;
//
//    @PostConstruct
//    public void init(){
//        customerList = new ArrayList<>(Arrays.asList(
//                new Customer(1l, "Bob", 80),
//                new Customer(2l, "John", 80),
//                new Customer(3l,"Michail", 80)
//
//        ));
//    }
//
//    public List<Customer> getAllClients(){
//        return Collections.unmodifiableList(customerList);
//    }
//
//    public Customer findById(Long id){
//        return customerList.stream().filter(c -> c.getId().equals(id))
//                .findFirst()
//                .orElseThrow(() -> new RuntimeException("Client not found"));
//    }
//
//    public void add(Long id, String name, Integer score){
//     customerList.add(new Customer(id, name, score));
//    }
//
//    public void addClient(Customer customer) {
//        customerList.add(customer);
//    }
}
