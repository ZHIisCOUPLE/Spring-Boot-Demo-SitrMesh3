package cn.xiaojf.springboot.mybatis.annotation.service.impl;

import cn.xiaojf.springboot.mybatis.annotation.entity.User;
import cn.xiaojf.springboot.mybatis.annotation.entity.UserAddr;
import cn.xiaojf.springboot.mybatis.annotation.mapper.UserMapper;
import cn.xiaojf.springboot.mybatis.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void findByUserName(String name) {
        List<User> list = userMapper.findByUserName(name);
        if (list != null) {
            for (User user : list) {
                System.out.println(user.getName());
            }
        }
    }

    @Override
    public void findUserAddrByName(String name) {
        User user = userMapper.findUserAddrByName(name);
        if (user != null) {
            List<UserAddr> userAddrList = user.getUserAddrList();
            if (userAddrList != null) {
                for (UserAddr userAddr : userAddrList) {
                    System.out.println(userAddr.getName());
                }
            }
        }
    }
}
