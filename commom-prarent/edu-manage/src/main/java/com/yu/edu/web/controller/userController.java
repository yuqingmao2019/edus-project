package com.yu.edu.web.controller;

import com.yu.edu.User;
import com.yu.edu.impl.ImplUserSerice;
import com.yu.edu.web.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class userController extends BaseController<User>{

    @Autowired
     private ImplUserSerice service;
    @RequestMapping("/login")
    public String login(){
        System.out.println("helloworddd");
        return "login";
    }

    @RequestMapping("/find")
    public String find(int id){
        System.out.println("find");
        User user=new User();
        user = service.findUserByid(id);
        System.out.println(user);
        return "User/info";
    }

    @RequestMapping(manage)
    public String manage(){

        System.out.println("进入mange方法。。。。。。");
        return manage_page;
    }



    @RequestMapping(info)
    public String info(){
        System.out.println("进入info方法。。。。。。");
        return info_page;
    }

    @RequestMapping(Edit)
    public String edit(){
        System.out.println("进入edit方法。。。。。。");
        return manage_page;
    }
}
