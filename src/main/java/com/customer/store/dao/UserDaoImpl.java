package com.customer.store.dao;

import com.customer.store.model.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private HibernateTemplate hibernateTemplate; //Spring Hibernate template

    @SuppressWarnings("unchecked")
    @Override
    public List<User> getAllUser() {
        String hql = "FROM User";
        return (List<User>) hibernateTemplate.find(hql);
    }

/*
    @Override
    public User getUserById(int id){
        return hibernateTemplate.get(User.class, id);
    }

    @Override
    public User getUserByLogin(String login){
        String hql = "FROM User u WHERE u.login = :login";
        return null;
    }



    @Override
    public void addUser(User user){
        hibernateTemplate.save(user);
    }


    @Override
    public void updateUser (User user) {
        User u = getUserById(user.getId());
        u.setName(user.getName());
        u.setPassword(user.getPassword());
        u.setLogin(user.getLogin());
        hibernateTemplate.update(u);
    }


    @Override
    public void deleteUser(int id){
        hibernateTemplate.delete(getUserById(id));
    }*/
}
