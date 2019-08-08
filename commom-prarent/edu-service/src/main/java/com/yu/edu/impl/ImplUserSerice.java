package com.yu.edu.impl;

import com.yu.edu.IUserService;
import com.yu.edu.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ImplUserSerice extends IUserService{

    public User login(String username, String password) {
        return null;
    }

    public User findUserByid(int id) {
        return umapper.findById(id);
    }

    public User findUserbyuuid(String uuid) {
        return null;
    }

    public void deletebyid(int id) {

    }

    public void deletebyuuid(String uuid) {

    }

    public void save(User model) {

    }

    public void update(User model) {

    }
}
