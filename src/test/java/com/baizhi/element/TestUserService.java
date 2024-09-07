package com.baizhi.element;

import com.baizhi.element.entity.User;
import com.baizhi.element.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestUserService {
    @Autowired
    private UserService userService;
    @Test
    public void testFindAll(){
        userService.findAll().forEach(user->{
            System.out.println("user = "+user);
        });
    }
}
