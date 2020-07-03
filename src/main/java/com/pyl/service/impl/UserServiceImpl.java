package com.pyl.service.impl;

import com.pyl.dao.UserDao;
import com.pyl.pojo.User;
import com.pyl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author 彭雨蕾
 * @Date Created in 2020/7/3
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> selectList() {
        return userDao.selectList();
    }
}
