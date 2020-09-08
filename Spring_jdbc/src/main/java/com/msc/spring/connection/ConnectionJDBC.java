package com.msc.spring.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Component("connection")
public class ConnectionJDBC {

    @Autowired
    @Qualifier("dataSource")
    private DriverManagerDataSource dataDB;

    @Autowired
    @Qualifier("jdbc")
    private JdbcTemplate jdbc;

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

    private DriverManagerDataSource getDataDB() {
        return dataDB;
    }

    public JdbcTemplate getConnection() {
        return jdbc;
    }

    /*
    public void testInsert(){
        try {

            JdbcTemplate template = getJdbc();
            String sql = "insert into employee values(?,?,?)";
            int result = template.update(sql,new Integer(2),"MSC2","Brower2");
            System.out.println(result);

        }catch(Exception e){
            System.out.println("Not Worked! " + e.getMessage());
        }
    }*/
}
