package cn.xiaojf.springboot.sitemesh3.filter;

import cn.xiaojf.springboot.sitemesh3.tagrule.MyTagRuleBundle;
import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

/**
 * sitemesh 自定义配置
 * @author xiaojf 2017/12/21 16:12
 */
public class Meshsite3Filter extends ConfigurableSiteMeshFilter {
    @Override
    protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
        builder.addDecoratorPath("/*", "/decorator/default")//拦截规则，/decorator/default 会被转发
                .addExcludedPath("/static/**") //白名单
                .addTagRuleBundle(new MyTagRuleBundle())//自定义标签
        ;
    }
}
