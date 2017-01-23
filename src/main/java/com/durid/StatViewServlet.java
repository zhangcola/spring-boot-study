package com.durid;

import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.WebInitParam;

/**
 * Created by cola on 2017/1/23.
 */

@WebServlet(urlPatterns="/druid/*", initParams =  {@WebInitParam(name="loginUsername",value="admin"),// 用户名
        @WebInitParam(name="loginPassword",value="123456"),// 密码
        @WebInitParam(name="resetEnable",value="false")})
public class StatViewServlet extends com.alibaba.druid.support.http.StatViewServlet {

}
