package com.jikexueyuan.wishingwall.filters;

import org.springframework.web.filter.CharacterEncodingFilter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by plter on 6/17/15.
 */
@WebFilter(filterName = "CharsetFilter",urlPatterns = "/*")
public class CharsetFilter extends CharacterEncodingFilter{


    public CharsetFilter(){
        setEncoding("UTF-8");
    }
}
