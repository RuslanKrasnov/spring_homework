package ru.geekbrains.springhw7.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.geekbrains.springhw7.data.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAllByCostBetween(Integer min, Integer max);

}
