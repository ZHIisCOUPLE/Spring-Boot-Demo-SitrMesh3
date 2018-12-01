package cn.xiaojf.springboot.mybatis.annotation.mapper;

import cn.xiaojf.springboot.mybatis.annotation.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserMapper {
    List<User> findByUserName(String name);

    User findUserAddrByName(String name);
}
