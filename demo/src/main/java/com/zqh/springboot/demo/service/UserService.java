package com.zqh.springboot.demo.service;


import com.zqh.springboot.demo.model.User;

import java.util.List;

public interface UserService {

    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);
}