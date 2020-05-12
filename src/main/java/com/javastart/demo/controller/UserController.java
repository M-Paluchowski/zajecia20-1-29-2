package com.javastart.demo.controller;

import com.javastart.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

@Controller
public class UserController {

//    @PersistenceUnit
//    private EntityManagerFactory entityManagerFactory;

    @PersistenceContext
//    @Autowired
    private EntityManager entityManager;

    @GetMapping("/")
    @ResponseBody
    @Transactional
    public String home() {

//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        entityManager.getTransaction().begin();
        User user = new User();
        user.setFirstName("Witold");
        entityManager.persist(user);
//        entityManager.getTransaction().commit();
        return "Działa";
    }

}
