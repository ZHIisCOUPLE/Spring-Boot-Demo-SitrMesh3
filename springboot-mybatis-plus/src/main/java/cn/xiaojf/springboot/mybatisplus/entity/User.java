package cn.xiaojf.springboot.mybatisplus.entity;

import cn.xiaojf.springboot.mybatisplus.SuperEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldFill;

import java.util.Date;
import java.util.List;

@TableName("sys_user")
public class User  extends SuperEntity<User> {
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
    @TableField(fill = FieldFill.INSERT)// 该注解插入忽略验证，自动填充
    private Date ctime;
    @TableField(exist = false)
    private List<UserAddr> userAddrList;

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
