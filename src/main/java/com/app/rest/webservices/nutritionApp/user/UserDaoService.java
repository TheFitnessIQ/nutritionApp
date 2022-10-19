package com.app.rest.webservices.nutritionApp.user;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class UserDaoService {
    //JPA or Hibernate
    //Static ArrayList
    private static List<User> users = new ArrayList<>();

    private static int usersCount = 0;
    static {
        users.add(new User(++usersCount,"Rajib","Male",170,28,83,5));
        users.add(new User(++usersCount,"Munnu","Female",150,27,63,3));
        users.add(new User(++usersCount,"Kunu","Male",150,30,83,2));
        users.add(new User(++usersCount,"Tunu","Male",165,32,83,1));

    }

    public List<User> findAll() {
        return users;
    }

    public User findOne(int id){
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()){
            User user = iterator.next();
            if(user.getId()==id){
                return user;
            }
        }
        return null;
    }

    public User save(User user){
        user.setId(++usersCount);
       users.add(user);
       return user;
    }
}
