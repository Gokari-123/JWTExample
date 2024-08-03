package com.jwt.example.Controller;

import com.jwt.example.Models.User;
import com.jwt.example.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class homeController {

    @Autowired
    private UserService userService;

    //http://localhost:8081/home/user
    @GetMapping("/user")
    public List<User> getUser(){
        System.out.println("Getting Users");
     return userService.getUser();
    }
    @GetMapping("/current-user")
    public String getLoggedInuser(Principal principal){
        return principal.getName();

    }
}
