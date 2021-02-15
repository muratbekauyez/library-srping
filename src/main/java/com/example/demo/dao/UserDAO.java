package com.example.demo.dao;


import com.example.demo.models.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class UserDAO {
    private static SessionFactory sessionFactory;

    @Autowired
    public UserDAO(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }

    public User findByUserName(String username)
    {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        User user;
        try
        {
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<User> cq = cb.createQuery(User.class);
            Root<User> root = cq.from(User.class);

            Predicate predicateUsername = cb.equal(root.get("username"), username);
            user = session.createQuery(cq.where(predicateUsername)).getSingleResult();
            //System.out.println("available authorities:"+user.getRole().getAuthorities());
            //System.out.println("USER DAO. Email:"+user.getEmail()+". Role: "+user.getRole().getId()+". Password: "+user.getPassword());
        }
        catch (NoResultException noResultException)
        {
            user = null;
        }
        return user;
    }

}