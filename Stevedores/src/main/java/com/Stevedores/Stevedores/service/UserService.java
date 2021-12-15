package com.Stevedores.Stevedores.service;

import com.Stevedores.Stevedores.dao.UserDAO;
import com.Stevedores.Stevedores.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public User createUser(User user){
        return userDAO.save(user);
    }
}
