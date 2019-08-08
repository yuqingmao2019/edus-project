package com.yu.edu;

import com.yu.edu.mapper.userMapper;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class IUserService implements IUserServicebase<User> {

    @Autowired
    protected userMapper umapper;

}
