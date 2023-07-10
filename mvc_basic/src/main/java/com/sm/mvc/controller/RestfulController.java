package com.sm.mvc.controller;

import com.sm.mvc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/users")
public class RestfulController {

    //@RequestMapping(method = RequestMethod.POST)
    //@ResponseBody
    @PostMapping
    public User save(@RequestBody User user){
        System.out.println("save user"+user);
        return user;
    }

    //@RequestMapping(method = RequestMethod.GET)
    //@ResponseBody
    @GetMapping
    public String getAll(){
        System.out.println("get all user");
        return "get all user";
    }

    //@RequestMapping(value = "/{id}",method = RequestMethod.GET)
    //@ResponseBody
    @GetMapping("/{id}")
    public String get(@PathVariable Integer id){
        System.out.println("get user n°"+id);
        return "get user n°"+id;
    }

    //@RequestMapping(method = RequestMethod.PUT)
    //@ResponseBody
    @PutMapping
    public User update(@RequestBody User user){
        /*user = new User();
        user.setId(5);
        user.setName("tim");
        user.setAge(27);*/
        System.out.println("update user°"+user.getId());
        return user;
    }

    //@RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    //@ResponseBody
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        System.out.println("delete user n°"+id);
        return "delete user n°"+id;
    }


}
