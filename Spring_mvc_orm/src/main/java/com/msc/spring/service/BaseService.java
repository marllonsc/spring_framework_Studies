package com.msc.spring.service;

import java.util.List;

public interface BaseService<T> {

    Boolean save(T obj);

    Boolean update(T obj);

    Boolean delete(T obj);

    T load(T obj);

    List<T> findAll();
}
