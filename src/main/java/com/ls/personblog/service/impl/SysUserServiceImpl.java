/**
 * @ClassName SysUserServiceImpl
 * @Description TODO
 * @Author linsong
 * @Date 2019/8/15 15:51
 * @Version 1.0
 **/
package com.ls.personblog.service.impl;

import com.ls.personblog.dao.SysUserMapper;
import com.ls.personblog.model.SysUser;
import com.ls.personblog.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser selectUserById(Integer id) {
        return sysUserMapper.selectUserById(id);
    }
}