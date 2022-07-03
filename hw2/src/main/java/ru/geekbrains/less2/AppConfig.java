package ru.geekbrains.less2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;

@Configuration
@ComponentScan("ru.geekbrains.less2")
public class AppConfig {

    @Bean
    @Scope("prototype")
    public HashMap<Product, Integer> hashMap() {
        return new HashMap<>();
    }

}
