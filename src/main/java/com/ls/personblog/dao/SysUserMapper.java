/**
 * @ClassName SysUserMapper
 * @Description TODO
 * @Author linsong
 * @Date 2019/8/15 15:54
 * @Version 1.0
 **/
package com.ls.personblog.dao;

import com.ls.personblog.model.SysUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysUserMapper {

    SysUser selectUserById(Integer id);
}