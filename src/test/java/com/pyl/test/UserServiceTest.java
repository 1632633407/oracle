package com.pyl.test;

import com.pyl.pojo.User;
import com.pyl.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Description
 * @Author 彭雨蕾
 * @Date Created in 2020/7/3
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserServiceTest {
    @Autowired
    private UserServiceImpl userService;
    @Test
    public void test() {
        List<User> userList = userService.selectList();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
