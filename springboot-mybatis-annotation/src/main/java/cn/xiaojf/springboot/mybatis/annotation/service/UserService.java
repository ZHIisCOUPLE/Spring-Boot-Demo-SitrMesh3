package cn.xiaojf.springboot.mybatis.annotation.service;

public interface UserService {
    void findByUserName(String name);

    void findUserAddrByName(String name);
}
