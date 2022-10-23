package com.app.rest.webservices.nutritionApp.user;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserJPAResource {


    private UserRepository repository;

    public UserJPAResource(UserRepository repository) {
        this.repository =repository;
    }

    @GetMapping("/jpa/users")
    public List<User> retrieveAllUsers(){
        return  repository.findAll();
    }

    @GetMapping("/jpa/users/{id}")
    public User retrieveUser(@PathVariable int id) {
         Optional<User> user = repository.findById(id);

         if(user.isEmpty()){
             //throw new UserNotFoundException("id: "+id);
         }
         return user.get();
    }

    @DeleteMapping("/jpa/users/{id}")
    public void deleteUser(@PathVariable int id){
        repository.deleteById(id);
    }

    //POST /user
    @PostMapping("/jpa/users")
    public void createUser(@RequestBody User user){
        repository.save(user);
    }

}
