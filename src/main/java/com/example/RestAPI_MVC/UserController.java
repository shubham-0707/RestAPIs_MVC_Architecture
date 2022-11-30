package com.example.RestAPI_MVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/get_users")
    public ResponseEntity<List<User>> getUsers(){
        return new ResponseEntity<>(userService.getUserService() , HttpStatus.ACCEPTED);
    }

    @PostMapping("/post_user")
    public ResponseEntity<String> postUser(@RequestBody(required = true)User user){
        userService.addUserService(user);
        return new ResponseEntity<>("User Added to the Database",HttpStatus.CREATED);
    }
}
