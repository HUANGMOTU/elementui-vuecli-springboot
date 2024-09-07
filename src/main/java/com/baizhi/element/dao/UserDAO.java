package com.baizhi.element.dao;

import com.baizhi.element.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDAO {
    //查询所有用户信息
    List<User> findAll();

    //保存用户信息
    void save(User user);

    //根据id删除一个用户
    void delete(String id);

    void update(User user);
}
