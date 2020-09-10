package com.msc.spring.dao;

import com.msc.spring.config.BeansConfig;
import com.msc.spring.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao implements BaseDao<User>{

    @Autowired
    @Qualifier("beansConfig")
    private BeansConfig beans;


    @Override
    @Transactional
    public Boolean create(User obj) {
        try{
            beans.getHibernateTemplate().save(obj);
            System.out.println("Sucess Insert!");
            return true;
        }catch (Exception e ){
            System.out.println("Error - " + e.getMessage());
            return false;
        }
    }

    @Override
    @Transactional
    public Boolean update(User obj) {
        try{
            beans.getHibernateTemplate().update(obj);
            System.out.println("Sucess Update!");
            return true;
        }catch (Exception e ){
            System.out.println("Error - " + e.getMessage());
            return false;
        }
    }

    @Override
    @Transactional
    public Boolean delete(User obj) {
        try{
            beans.getHibernateTemplate().delete(obj);
            System.out.println("Sucess Delete!");
            return true;
        }catch (Exception e ){
            System.out.println("Error - " + e.getMessage());
            return false;
        }
    }

    @Override
    public User read(User obj) {
        try{
            return (User) beans.getHibernateTemplate().get(User.class,obj.getId());
        }catch (Exception e ){
            System.out.println("Error - " + e.getMessage());
            return null;
        }
    }

    @Override
    public List<User> getAll() {
        try{
            return beans.getHibernateTemplate().loadAll(User.class);
        }catch (Exception e ){
            System.out.println("Error - " + e.getMessage());
            return new ArrayList<User>();
        }
    }
}
