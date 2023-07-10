package com.sm.mvc.controller;

import com.sm.mvc.domain.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
public class ParamController {

    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(String name, int age){
        System.out.println("name ==> "+name);
        System.out.println("name ==> "+age);
        return "{'module':'common param'}";
    }

    @RequestMapping("/commonParamDiff")
    @ResponseBody
    public String commonParamDiff(@RequestParam("name") String username, int age){
        System.out.println("name ==> "+username);
        System.out.println("name ==> "+age);
        return "{'module':'common param different'}";
    }

    @RequestMapping("/pojoParam")
    @ResponseBody
    public String pojoParam(User user){
        System.out.println("name ==> "+user);
        return "{'module':'pojo param'}";
    }

    @RequestMapping("/arrayParam")
    @ResponseBody
    public String arrayParam(String[] likes){
        System.out.println("array likes ==> "+ Arrays.toString(likes));
        return "{'module':'array param'}";
    }

    @RequestMapping("/listParam")
    @ResponseBody
    public String listParam(@RequestParam List<String> likes){
        System.out.println("list likes ==> "+ likes);
        return "{'module':'list param'}";
    }

    @RequestMapping("/listParamJson")
    @ResponseBody
    public String listParamJson(@RequestBody List<String> likes){
        System.out.println("list json likes ==> "+ likes);
        return "{'module':'list param Json'}";
    }

    @RequestMapping("/pojoParamJson")
    @ResponseBody
    public User pojoParamJson(@RequestBody User user){
        System.out.println("pojo json User ==> "+user);
        //return "{'module':'pojo param json'}";
        return user;
    }

    @RequestMapping("/listPojoParamJson")
    @ResponseBody
    public List<User> listPojoParamJson(@RequestBody List<User> list){
        System.out.println("list pojo json likes ==> "+ list);
        //return "{'module':'list pojo param Json'}";
        return list;
    }

    @RequestMapping("/dateParam")
    @ResponseBody
    public String dateParam(Date date, @DateTimeFormat(pattern = "dd-MM-yyyy") Date d1, @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss") Date d2){
        System.out.println("Date ==> "+ date);
        System.out.println("Date dd-MM-yyyy ==> "+ d1);
        System.out.println("Date dd/MM/yyyy HH:mm:ss ==> "+ d2);
        return "{'module':'date param'}";
    }
}
