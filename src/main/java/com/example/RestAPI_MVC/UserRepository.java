package com.example.RestAPI_MVC;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@Component
public class UserRepository {

    Map<Integer , User> map = new HashMap<>();

    public void addUserToDB(User u){
        map.put(u.getId() , u);
    }

    public List<User> getUsersfromDB(){
        List<User> ans = new ArrayList<>();
        for(User user : map.values()){
            ans.add(user);
        }

        return ans;
    }
}
