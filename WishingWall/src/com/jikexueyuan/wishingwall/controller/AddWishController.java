package com.jikexueyuan.wishingwall.controller;

import com.jikexueyuan.wishingwall.db.DbConnection;
import com.jikexueyuan.wishingwall.db.WishEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by plter on 6/17/15.
 */

@Controller
public class AddWishController {


    @RequestMapping(value = "/addwish",method = RequestMethod.POST)
    public String addWish(ModelMap map,
                          @RequestParam(value = "name",required = false) String name,
                          @RequestParam(value = "content",required = false) String content){

        Session session = DbConnection.getSession();

        Transaction transaction = session.beginTransaction();

        WishEntity entity = new WishEntity();
        entity.setName(name);
        entity.setContent(content);
        session.save(entity);
        transaction.commit();

        session.close();
        return "addwish";
    }
}
