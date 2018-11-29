package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;


@RestController
public class HelloWorldController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    public Map<String,Object> home() {
        Map<String,Object> model = new HashMap<String,Object>();
        model.put("id", UUID.randomUUID().toString());
        model.put("content", "Hello World");
        return model;
    }

    @RequestMapping("/roles")
    public List<String> roles() {
        List<String> model = new ArrayList<>();
        model.add("Administrator");
        model.add("Super Admin");
        model.add("User");
        model.add("View-Only");
        return model;
    }


    @RequestMapping("/users")
    public List<String> users() {
        List<String> model = new ArrayList<>();
        model.add("Ratna Akula");
        model.add("Venkata Akula");
        model.add("Prathyusha Akula");
        model.add("Raj Akula");
        return model;
    }

    @RequestMapping("/userscrud")
    public ResponseEntity<List<User>> listAllUsers() {
        List<User> users = userService.findAllUsers();
        if(users.isEmpty()){
            return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }


}







