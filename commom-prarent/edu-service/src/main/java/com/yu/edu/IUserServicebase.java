package com.yu.edu;

public interface IUserServicebase<T> {
    public T findUserByid(int id);
    public T findUserbyuuid(String uuid);

    public void deletebyid(int id);

    public void deletebyuuid(String uuid);

    public void save(T model);

    public void update(T model);
}
