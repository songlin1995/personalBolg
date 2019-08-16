/**
 * @ClassName UserController
 * @Description TODO
 * @Author linsong
 * @Date 2019/8/15 15:42
 * @Version 1.0
 **/
package com.ls.personblog.controller;

import com.ls.personblog.model.SysUser;
import com.ls.personblog.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/user/{id}")
    public SysUser getUser(@PathVariable("id") Integer id){
        SysUser user=sysUserService.selectUserById(id);
        return user;
    }
}