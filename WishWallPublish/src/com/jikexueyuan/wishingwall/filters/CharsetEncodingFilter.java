package com.jikexueyuan.wishingwall.filters;

import org.springframework.web.filter.CharacterEncodingFilter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by plter on 6/16/15.
 */
public class CharsetEncodingFilter extends CharacterEncodingFilter{

    public CharsetEncodingFilter(){
        setEncoding("UTF-8");
    }
}
