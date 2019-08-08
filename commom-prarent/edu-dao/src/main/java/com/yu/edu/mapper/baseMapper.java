package com.yu.edu.mapper;

public interface baseMapper<T>{
    public T findById(int id);
    public T findUserbyuuid(String uuid);

    public void deletebyid(int id);

    public void deletebyuuid(String uuid);

    public void save(T model);

    public void update(T model);
}
