package com.example.demo.service;


import com.example.demo.bean.User;

public interface UserService {

    Object listAll(int page, int size);

    int insert(User user);

    int remove(Integer userId);

    int update(User user);

}

