package cn.xiaojf.springboot.sitemesh3.configure;

import cn.xiaojf.springboot.sitemesh3.filter.Meshsite3Filter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfigure extends WebMvcConfigurerAdapter {
    @Bean
    public FilterRegistrationBean siteMeshFilter() {
        FilterRegistrationBean fitler = new FilterRegistrationBean();
        Meshsite3Filter siteMeshFilter = new Meshsite3Filter();
        fitler.setFilter(siteMeshFilter);
        return fitler;
    }
}
