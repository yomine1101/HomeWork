package com.example.springwebservice.controller;

import com.example.springwebservice.controller.dto.request.CreateUserRequest;
import com.example.springwebservice.controller.dto.request.UpdateUserRequest;
import com.example.springwebservice.controller.dto.response.StatusResponse;
import com.example.springwebservice.model.entriy.User;
import com.example.springwebservice.service.UserService;
import org.apache.logging.log4j.message.ReusableMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        List<User>  userList = this.userService.getAllUsers();
        return userList;
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable int id) {
        User response = userService.getUserById(id);
        return response;
    }


    @PostMapping("/users")
    public StatusResponse createUser(@RequestBody CreateUserRequest request) {
        String response = this.userService.createUser(request);
        return new StatusResponse(response); //return JSON
        //e.g.
        // return response ----> 會回傳 text
    }

    @PutMapping("/users/{id}")
    public StatusResponse updateUser(@PathVariable int id, @RequestBody UpdateUserRequest request) {
        String response = this.userService.updateUser(id, request);
        return new StatusResponse(response);
    }

    @DeleteMapping("/users/{id}")
    public StatusResponse deleteUserById(@PathVariable int id) {
        String response = this.userService.deleteUserById(id);
        return new StatusResponse(response);
    }
} // Class end
