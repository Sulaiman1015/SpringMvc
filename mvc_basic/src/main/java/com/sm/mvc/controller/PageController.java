package com.sm.mvc.controller;

import com.sm.mvc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PageController {

    @RequestMapping("/jump")
    public String jumpPage(){
        return "index.jsp";
    }

    @RequestMapping("/text")
    @ResponseBody
    public String text(){
        return "response text";
    }

    @RequestMapping("/jesonPojo")
    @ResponseBody
    public User pojo(){
        User user = new User();
        user.setName("Tonny");
        user.setAge(25);
        return user;
    }

    @RequestMapping("/jsonPojoList")
    @ResponseBody
    public List<User> pojoList(){
        User u1 = new User();
        u1.setName("Tonny");
        u1.setAge(25);

        User u2 = new User();
        u2.setName("Jenny");
        u2.setAge(23);

        List<User> list = new ArrayList<>();
        list.add(u1);
        list.add(u2);
        return list;
    }
}
