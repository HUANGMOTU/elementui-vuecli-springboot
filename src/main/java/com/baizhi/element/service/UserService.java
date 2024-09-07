package com.baizhi.element.service;

import com.baizhi.element.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    void save(User user);

    void delete(String id);

    void update(User user);
}
