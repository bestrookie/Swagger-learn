package com.example.controller;
import com.example.pojo.User;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : bestrookie
 */
@RestController
@RequestMapping("/")
public class HelloController{
    @RequestMapping(value = "/hello")
    public String hello(String username){
        return "hello-word"+username;
    }
    @RequestMapping("/getUser")
    public User getUser(){
        return  new User();
    }
    @RequestMapping("/post")
    public String post(User user){
        return user.password;
    }
    @GetMapping("/hello2")
    public  String hello2(@ApiParam String name){
        return "hello"+name;
    }
}
