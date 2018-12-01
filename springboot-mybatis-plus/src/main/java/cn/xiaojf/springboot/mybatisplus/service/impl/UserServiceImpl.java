package cn.xiaojf.springboot.mybatisplus.service.impl;

import cn.xiaojf.springboot.mybatisplus.entity.User;
import cn.xiaojf.springboot.mybatisplus.entity.UserAddr;
import cn.xiaojf.springboot.mybatisplus.mapper.UserMapper;
import cn.xiaojf.springboot.mybatisplus.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl  extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public void findByUserName(String name) {
        List<User> list = this.baseMapper.findByUserName(name);
        if (list != null) {
            for (User user : list) {
                System.out.println(user.getName());
            }
        }
    }

    @Override
    public void findUserAddrByName(String name) {
        User user = this.baseMapper.findUserAddrByName(name);
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
