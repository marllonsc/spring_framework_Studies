package com.msc.spring.service;

import com.msc.spring.dao.UserDao;
import com.msc.spring.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements BaseService<User>{

    @Autowired
    private UserDao dao;

    public UserDao getDao() {
        return dao;
    }

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public Boolean save(User obj) {
        return dao.create(obj);
    }

    @Override
    public Boolean update(User obj) {
        return dao.update(obj);
    }

    @Override
    public Boolean delete(User obj) {
        return dao.delete(obj);
    }

    @Override
    public User load(User obj) {
        return dao.read(obj);
    }

    @Override
    public List<User> findAll() {
        return dao.getAll();
    }

    public String validateEmail(User user,String action){
        Integer id = user.getId();
        user = dao.read(user.getEmail());
        String msg = "";
        if(user != null && ((action.equals("update") && id == user.getId()) || action.equals("add"))){
            msg = "Email Already exist.";
        }
        return msg;
    }
}
