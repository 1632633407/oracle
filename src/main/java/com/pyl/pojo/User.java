package com.pyl.pojo;

import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author 彭雨蕾
 * @Date Created in 2020/7/3
 */
@Component
public class User {
    private Integer id;
    private Integer age;
    private String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", username='" + username + '\'' +
                '}';
    }
}
