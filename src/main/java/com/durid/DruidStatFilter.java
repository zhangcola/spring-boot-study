package com.durid;

import com.alibaba.druid.filter.stat.StatFilter;
import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Created by cola on 2017/1/23.
 */
@WebFilter(filterName = "druidWebStatFilter", urlPatterns = "/*",
    initParams = { @WebInitParam(name="exclusions",value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")})
public class DruidStatFilter extends WebStatFilter {

}
