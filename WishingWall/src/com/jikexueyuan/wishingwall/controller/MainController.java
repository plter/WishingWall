package com.jikexueyuan.wishingwall.controller;

import com.jikexueyuan.wishingwall.db.DbConnection;
import com.jikexueyuan.wishingwall.db.WishEntity;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by plter on 6/17/15.
 */

@Controller
public class MainController {


    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String mainPage(ModelMap map){

        Session session = DbConnection.getSession();

        List list = session.createCriteria(WishEntity.class).setMaxResults(100).addOrder(Order.desc("id")).list();
        map.addAttribute("wishList",list);

        session.close();

        return "main";
    }
}
