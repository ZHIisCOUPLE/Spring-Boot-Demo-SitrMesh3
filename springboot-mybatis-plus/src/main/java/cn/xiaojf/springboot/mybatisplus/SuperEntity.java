package cn.xiaojf.springboot.mybatisplus;

import com.baomidou.mybatisplus.activerecord.Model;

import java.io.Serializable;

public class SuperEntity<T extends Model> extends Model<T> {

    private Long id;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
