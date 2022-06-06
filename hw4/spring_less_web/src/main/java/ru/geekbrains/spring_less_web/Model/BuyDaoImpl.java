package ru.geekbrains.spring_less_web.Model;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.geekbrains.spring_less_web.SessionFactoryUtils;

import java.util.List;

@Component
public class BuyDaoImpl implements BuyDao {

    @Autowired
    private SessionFactoryUtils sessionFactoryUtils;

    @Override
    public Product findById(Long id) {
        return null;
    }

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Product saveOrUpdate(Product product) {
        return null;
    }

    @Override
    public List<Customer> findProductCustomers(Long prodId) {
        try (Session session = sessionFactoryUtils.getSession()){
            session.beginTransaction();
//            SELECT u FROM University u JOIN FETCH u.students WHERE u.id = :id
            List<Customer> customers = session.createQuery("select b from Buy b WHERE product_id = 1").getResultList();
            session.getTransaction().commit();
            return customers;
        }
    }

    @Override
    public List<Product> findCustomerProducts(Customer customer) {
        return null;
    }
}
