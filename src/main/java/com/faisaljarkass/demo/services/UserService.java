package com.faisaljarkass.demo.services;

import com.faisaljarkass.demo.domains.MyUser;
import com.faisaljarkass.demo.domains.TweetString;

import java.util.ArrayList;
import java.util.List;

public interface UserService {

    MyUser getUser(String username, String password);

    void create(String tweet);

    public List<TweetString> getTweets();

}
