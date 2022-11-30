package com.example.RestAPI_MVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void addUserService(User user){
        userRepository.addUserToDB(user);
    }

    public List<User> getUserService(){
        return userRepository.getUsersfromDB();
    }



}
