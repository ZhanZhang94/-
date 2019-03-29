package com.onps.utils;

import com.onps.model.User;
import com.onps.service.UserSessionService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

public class MyShrio extends AuthorizingRealm {

    @Autowired
    private UserSessionService userSessionService;
    /**
     * 执行授权逻辑
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    /**
     * 执行认证逻辑
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("进入权限控制");
        //判断用户名
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        User user = userSessionService.loggin(token.getUsername());
        if(user == null){
            return null;
        }
        //判断密码
        return new SimpleAuthenticationInfo("",user.getPassword(),"");
    }
}
