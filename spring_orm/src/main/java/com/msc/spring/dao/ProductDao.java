package com.msc.spring.dao;


import com.msc.spring.connection.OmrBeans;
import com.msc.spring.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component("productDao")
public class ProductDao  implements BaseDao<Product> {

    @Autowired
    @Qualifier("omrBeans")
    private OmrBeans beans;

    @Override
    @Transactional
    public Boolean create(Product obj) {
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
    public Boolean update(Product obj) {
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
    public Boolean delete(Product obj) {
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
    public Product read(Product obj) {
        try{
            return (Product) beans.getHibernateTemplate().get(Product.class,obj.getId());
        }catch (Exception e ){
            System.out.println("Error - " + e.getMessage());
            return null;
        }
    }

    @Override
    @Transactional
    public List<Product> getAll() {
        try{
            return beans.getHibernateTemplate().loadAll(Product.class);
        }catch (Exception e ){
            System.out.println("Error - " + e.getMessage());
            return new ArrayList<Product>();
        }
    }
}
