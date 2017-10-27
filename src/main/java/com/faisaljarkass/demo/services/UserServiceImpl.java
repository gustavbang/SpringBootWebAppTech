package com.faisaljarkass.demo.services;

import com.faisaljarkass.demo.domains.MyUser;
import com.faisaljarkass.demo.domains.TweetString;
import com.faisaljarkass.demo.repositories.TweetRepo;
import com.faisaljarkass.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbc;
    private UserRepository userRepository;
    ArrayList<MyUser> users = new ArrayList<>();
    private MyUser user;
    @Autowired
    TweetRepo tweetRepo;

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
    @Override
    public void create(String tweet) {

        jdbc.update("INSERT INTO tweets.tweettable(tekst) " + "VALUES('" + tweet
                + "') ");
    }

    public List<TweetString> getTweets() {
        return tweetRepo.findAllByOrderByIdDesc();

    }


}
