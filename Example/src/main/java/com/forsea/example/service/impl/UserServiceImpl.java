package com.forsea.example.service.impl;

import com.forsea.example.dao.UserDAO;
import com.forsea.example.pojo.UserDO;
import com.forsea.example.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    public UserDO getUserByUid(Integer uid) {
        return userDAO.getUserByUid(uid);
    }
}
