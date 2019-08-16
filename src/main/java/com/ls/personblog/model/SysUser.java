/**
 * @ClassName SysUser
 * @Description TODO
 * @Author linsong
 * @Date 2019/8/15 15:43
 * @Version 1.0
 **/
package com.ls.personblog.model;

public class SysUser {

    private int userId;

    private String userNum;

    private String userName;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserNum() {
        return userNum;
    }

    public void setUserNum(String userNum) {
        this.userNum = userNum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "userId=" + userId +
                ", userNum='" + userNum + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}