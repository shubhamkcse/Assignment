package com.user.controller;

import com.user.entity.User;
import com.user.service.UserServieImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServieImpl userServie;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Long id){
       User user = userServie.getUser(id);
       List contacts = restTemplate.getForObject("http://contact-service/contact/user/"+id, List.class);
       user.setContacts(contacts);
       return  user;
    }
}