package com.faisaljarkass.demo.services;

import com.faisaljarkass.demo.domains.MyUser;

public interface UserService {

    MyUser getUser(String username, String password);

}
