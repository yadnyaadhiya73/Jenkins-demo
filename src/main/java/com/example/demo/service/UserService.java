package com.example.demo.service;

import com.example.demo.dto.UserRequest;
import com.example.demo.entity.User;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User saveUser(UserRequest userRequest) {

        User user = User.build(0, userRequest.getName(),
                userRequest.getEmail(), userRequest.getMobile(), userRequest.getGender(),
                userRequest.getAge(), userRequest.getNationality());
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUser(int id) throws UserNotFoundException {
        //userRepository.findById(id);
        User user= userRepository.findByUserId(id);
        if(user!=null){
            return user;
        }
        else throw new UserNotFoundException("user with id "+id +" not found");
    }


}
