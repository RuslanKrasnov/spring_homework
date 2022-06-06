package ru.geekbrains.spring_less_web;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class SessionFactoryUtils {
    @Autowired
    private SessionFactory factory;

//    public void init(){
//        factory = new Configuration()
//                .configure("hibernate.cfg.xml")
//                .buildSessionFactory();
//    }

    public Session getSession(){
        return factory.getCurrentSession();
    }

    @PreDestroy
    public void shutdown(){
        if(factory != null){
            factory.close();
        }
    }

}