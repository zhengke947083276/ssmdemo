package org.com.service.impl;

import org.com.dao.UserMapper;
import org.com.entity.User;
import org.com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    //注入
    @Autowired
    UserMapper userMapper;
    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }
    @Override
    public int update(User user) {
        return userMapper.update(user);
    }

    @Override
    public int delete(int user_id) {
        return userMapper.delete(user_id);
    }

    @Override
    public User selectById(int user_id) {
        return userMapper.selectById(user_id);
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }
}
