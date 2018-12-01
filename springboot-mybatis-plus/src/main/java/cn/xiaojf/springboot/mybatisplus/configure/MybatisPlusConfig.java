package cn.xiaojf.springboot.mybatisplus.configure;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("cn.xiaojf.springboot.mybatisplus.mapper*")
public class MybatisPlusConfig {

}
