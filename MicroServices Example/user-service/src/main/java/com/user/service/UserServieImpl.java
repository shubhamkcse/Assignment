package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServieImpl implements UserService{

    List<User> userList = List.of(
            new User(11L,"Shubham","s@gmail.com"),
            new User(12L,"Dinesh","d@gmail.com"),
            new User(13L,"Sar","sr@gmail.com")
    );



    @Override
    public User getUser(Long userId) {
        return userList.stream().filter(user -> user.getUserId().equals(userId)).findAny().orElse(null);
    }
}
