package cn.xiaojf.springboot.mybatis.annotation.entity;

import java.util.Date;
import java.util.List;

public class User {
    /**
     * 用户ID
     */
    private Long id;
    /**
     * 用户名
     */
    private String name;

    /**
     * 用户年龄
     */
    private Integer age;

    /**
     * 自定义填充的创建时间
     */
    private Date ctime;

    private List<UserAddr> userAddrList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public List<UserAddr> getUserAddrList() {
        return userAddrList;
    }

    public void setUserAddrList(List<UserAddr> userAddrList) {
        this.userAddrList = userAddrList;
    }
}
