package cn.xiaojf.springboot.mybatisplus.entity;

import cn.xiaojf.springboot.mybatisplus.SuperEntity;
import com.baomidou.mybatisplus.annotations.TableName;

@TableName("sys_user_addr")
public class UserAddr extends SuperEntity<UserAddr> {
    private String name;
    private String userId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
