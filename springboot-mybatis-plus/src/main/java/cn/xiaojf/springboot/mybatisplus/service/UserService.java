package cn.xiaojf.springboot.mybatisplus.service;

import cn.xiaojf.springboot.mybatisplus.entity.User;
import com.baomidou.mybatisplus.service.IService;

public interface UserService  extends IService<User> {
    void findByUserName(String name);

    void findUserAddrByName(String name);
}
