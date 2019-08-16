/**
 * @ClassName SysUserService
 * @Description TODO
 * @Author linsong
 * @Date 2019/8/15 15:51
 * @Version 1.0
 **/
package com.ls.personblog.service;

import com.ls.personblog.model.SysUser;

public interface SysUserService {

    SysUser selectUserById(Integer id);
}