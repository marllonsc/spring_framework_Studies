package com.msc.spring.connection;

import com.msc.spring.entity.Product;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;

@Component("omrBeans")
public class OmrBeans {

    @Autowired
    @Qualifier("dataSource")
    private DriverManagerDataSource dataDB;

    @Autowired
    @Qualifier("jdbc")
    private JdbcTemplate jdbc;

    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    @Autowired
    @Qualifier("hibernateTemplate")
    private HibernateTemplate hibernateTemplate;

    @Autowired
    @Qualifier("transactionManager")
    private HibernateTransactionManager transactionManager;

    @Bean("dataSource")
    private DriverManagerDataSource createDataSource(){
        DriverManagerDataSource datasource = new DriverManagerDataSource("jdbc:mysql://localhost:13306/test","root","12345");
        datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        return datasource;
    }

    @Bean("jdbc")
    private JdbcTemplate createTemplate(){
        JdbcTemplate template = new JdbcTemplate();
        template.setDataSource(getDataDB());
        return template;
    }

    @Bean("sessionFactory")
    private LocalSessionFactoryBean createSessionFactory(){
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(getDataDB());
        sessionFactory.getHibernateProperties().put("hibernate.dialect","org.hibernate.dialect.MySQLDialect");
        sessionFactory.getHibernateProperties().put("hibernate.show_sql",true);
        sessionFactory.setAnnotatedClasses(Product.class);
        return sessionFactory;
    }

    @Bean("hibernateTemplate")
    private HibernateTemplate createHibernateTemplate(){
        HibernateTemplate hibernateTemplate = new HibernateTemplate();
        hibernateTemplate.setSessionFactory(getSessionFactory());
        return hibernateTemplate;
    }

    @Bean("transactionManager")
    private HibernateTransactionManager createHibernateTransection(){
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(getSessionFactory());
        return transactionManager;
    }

    private DriverManagerDataSource getDataDB() {
        return dataDB;
    }

    public JdbcTemplate getConnection() {
        return jdbc;
    }

    public SessionFactory getSessionFactory() { return sessionFactory; }

    public HibernateTemplate getHibernateTemplate() { return hibernateTemplate;  }

    public HibernateTransactionManager getTransactionManager() {  return transactionManager; }
}
