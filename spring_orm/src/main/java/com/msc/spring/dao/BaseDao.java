package com.msc.spring.dao;

import java.util.List;

public interface BaseDao<T> {

    Boolean create(T obj);

    Boolean update(T obj);

    Boolean delete(T obj);

    T read(T obj);

    List<T> getAll();
}
