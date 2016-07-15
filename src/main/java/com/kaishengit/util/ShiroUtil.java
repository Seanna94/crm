package com.kaishengit.util;

import com.kaishengit.pojo.User;
import org.apache.shiro.SecurityUtils;

public class ShiroUtil {
    //获得当前登录用户
    public static User getCurrentUser(){
        return (User) SecurityUtils.getSubject().getPrincipal();
    }

    public static Integer getCurrentUserID(){
        return getCurrentUser().getId();
    }

    public static String getCurrentUserName(){
        return getCurrentUser().getUsername();
    }
}
