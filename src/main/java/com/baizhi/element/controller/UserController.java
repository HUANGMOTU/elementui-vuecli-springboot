package com.baizhi.element.controller;

import com.baizhi.element.entity.User;
import com.baizhi.element.service.UserService;
import com.baizhi.element.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//跨域 前后端分离会用到
@CrossOrigin
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    //删除用户
    @DeleteMapping("delete")
    public Result delete(String id) {
        Result result = new Result();
        try{
            userService.delete(id);
            result.setMsg("删除用户信息成功！");
        }catch (Exception e){
            e.printStackTrace();
            result.setMsg("删除用户信息失败,请稍后再试！");
            result.setStatus(false);
        }
        return result;
    }

    @GetMapping("findAll")
    public List<User> findAll() {
        return userService.findAll();
    }

    @PostMapping("saveOrUpdate")
    public Result saveOrUpdate(@RequestBody User user) {
        Result result = new Result();
        try {
            if (StringUtils.isEmpty(user.getId())) {
                userService.save(user);
                result.setMsg("用户信息保存成功!!!");
            }else {
                userService.update(user);
                result.setMsg("用户信息编辑成功!!!");
            }
            }catch (Exception e) {
            result.setStatus(false);
            result.setMsg("系统错误：保存用户信息失败，请稍后再试。。。");
        }
        return result;
    }

}
