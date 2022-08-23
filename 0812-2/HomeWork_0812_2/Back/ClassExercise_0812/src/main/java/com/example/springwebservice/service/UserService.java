package com.example.springwebservice.service;

import com.example.springwebservice.controller.dto.request.CreateUserRequest;
import com.example.springwebservice.controller.dto.request.UpdateUserRequest;
import com.example.springwebservice.model.UserRepository;
import com.example.springwebservice.model.entriy.User;
import org.apache.el.util.ReflectionUtil;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;




    public List<User> getAllUsers() {
        List<User> response = userRepository.findAll();
        return response;
    }

    public User getUserById(int id) {
        User response = userRepository.findById(id);
        return response;
        }

public String createUser(CreateUserRequest request){

        //空的 user entity
        User user = new User();

        //Data從request來
        user.setId(request.getId());
        user.setAge(request.getAge());
        user.setName(request.getName());

        //sava前 user 要判斷 id 是否重複
        //sava到DB
        userRepository.save(user);

        //return OK for Controller -> save success
        return "OK";
}

    public String updateUser(int id, UpdateUserRequest request){

        //check id
        User user = userRepository.findById(id);

        //if not found id
        //要被比較的value放 == 後面
        if(null == user){
            return "Failure";
        }

        //Data從request來
        user.setAge(request.getAge());
        user.setName(request.getName());

        //sava到DB
        userRepository.save(user);

        //return OK for Controller -> save success
        return "OK";
    }

    public  String deleteUserById(int id){

        User user = userRepository.findById(id);

        if(null == user){
            return "Failure";
        }

        //JPA return delete and create 為 long type
        Long count = userRepository.deleteById(id);

        // 下面這種要先判斷user是否存在
        // userRepository.delete(user);
        return "OK";
    }


}
