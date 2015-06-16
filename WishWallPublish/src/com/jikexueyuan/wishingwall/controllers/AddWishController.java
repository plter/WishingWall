package com.jikexueyuan.wishingwall.controllers;

import com.jikexueyuan.wishingwall.db.DbConnection;
import com.jikexueyuan.wishingwall.db.WishEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.UnsupportedEncodingException;

/**
 * Created by plter on 6/16/15.
 */

@Controller
public class AddWishController {

    @RequestMapping(value = "/addwish",method = RequestMethod.POST)
    public String addWish(ModelMap map,@RequestParam(value = "name",required = false) String name,@RequestParam(value = "content",required = false) String content) throws UnsupportedEncodingException {

        if (name!=null&&!name.equals("")&&content!=null&&!content.equals("")) {
            Session session = DbConnection.getSession();
            Transaction transaction = session.beginTransaction();

            WishEntity wish = new WishEntity();
            wish.setName(name);
            wish.setContent(name);
            session.save(wish);

            transaction.commit();
            session.close();
        }
        return "addwish.jsp";
    }

}
