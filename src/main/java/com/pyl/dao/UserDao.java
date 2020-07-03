package com.pyl.dao;

import com.pyl.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description
 * @Author 彭雨蕾
 * @Date Created in 2020/7/3
 */
@Repository
public interface UserDao {
    List<User> selectList();
}
