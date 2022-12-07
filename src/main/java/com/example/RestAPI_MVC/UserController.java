package com.example.RestAPI_MVC;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    public Logger logger  = LoggerFactory.getLogger(UserController.class);



    @GetMapping("/get_users")
    public ResponseEntity<List<User>> getUsers(){
        logger.info("user printed");
        return new ResponseEntity<>(userService.getUserService() , HttpStatus.ACCEPTED);
    }

    @PostMapping("/post_user")
    public ResponseEntity<String> postUser(@RequestBody(required = true)User user){
        logger.info("User added");
        userService.addUserService(user);
        return new ResponseEntity<>("User Added to the Database",HttpStatus.CREATED);
    }
}
