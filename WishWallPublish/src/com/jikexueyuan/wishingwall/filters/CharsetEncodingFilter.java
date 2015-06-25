package com.jikexueyuan.wishingwall.filters;

import org.springframework.web.filter.CharacterEncodingFilter;

import javax.servlet.annotation.WebFilter;

/**
 * Created by plter on 6/16/15.
 */
@WebFilter(filterName = "CharsetFilter",urlPatterns = "/*")
public class CharsetEncodingFilter extends CharacterEncodingFilter{

    public CharsetEncodingFilter(){
        setEncoding("UTF-8");
    }
}
