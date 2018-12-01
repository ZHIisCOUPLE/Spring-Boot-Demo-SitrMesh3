package cn.xiaojf.springboot.mybatisplus.mapper;

import cn.xiaojf.springboot.mybatisplus.SuperMapper;
import cn.xiaojf.springboot.mybatisplus.entity.User;

import java.util.List;

public interface UserMapper extends SuperMapper<User> {
    List<User> findByUserName(String name);

    User findUserAddrByName(String name);
}
