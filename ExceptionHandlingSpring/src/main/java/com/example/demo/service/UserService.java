package com.example.demo.service;

import com.example.demo.dto.UserRequest;
import com.example.demo.entity.User;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
        @Autowired
        private UserRepo userRepo;

        public User saveUser(UserRequest userRequest){
            User user = User.build(0,userRequest.getName(),userRequest.getEmail(), userRequest.getMobile(),userRequest.getGender()
                    , userRequest.getAge());
            return  userRepo.save(user);
        }

        public List<User> getAllUsers()
        {
            return userRepo.findAll();
        }

        public User getUser(Integer id) throws UserNotFoundException {
            User user = userRepo.findByUserId(id);
            if(user!=null)
                return user;
            else
                throw new UserNotFoundException("user not found with id :" +id);
        }
}
