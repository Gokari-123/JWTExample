package com.jwt.example.Service;

import com.jwt.example.Models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Service
public class UserService {

    private List<User>store=new ArrayList<>();

    public UserService() {
       store.add(new User(UUID.randomUUID().toString(),"Basha","Basha@dev.in"));
       store.add(new User(UUID.randomUUID().toString(),"Mahaboob","Mahaboob@dev.in"));
       store.add(new User(UUID.randomUUID().toString(),"GOKARI","Gokari@dev.in"));
    }
    public List<User> getUser(){
        return this.store;
    }
}