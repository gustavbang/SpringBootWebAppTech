package com.faisaljarkass.demo.services;

import com.faisaljarkass.demo.domains.MyUser;
import com.faisaljarkass.demo.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    ArrayList<MyUser> users = new ArrayList<>();
    private MyUser user;

    public UserServiceImpl(UserRepository userRepository){

        this.userRepository = userRepository;
        users.add(this.user = new MyUser(1l, "admin", "admin", new ArrayList<String>(), "user", "admin"));

        users.add(this.user = new MyUser(2l, "user", "user", new ArrayList<String>(), "user"));
    }

    @Override
    public MyUser getUser(String username, String password){

        for (int i=0; i<users.size(); i++) {
            if(users.get(i).getUsername().equals(username) && users.get(i).getPassword().equals(password)) {
                return users.get(i);
            }
        }
        return null;
    }
}
