package com.kuanquan.springboot.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;

import java.util.Iterator;

/**
 * spring boot 配置环境事件监听
 * ApplicationEnvironmentPreparedEvent spring boot 对应Enviroment已经准备完毕，但此时上下文context还没有创建
 */
public class MyApplicationEnvironmentPreparedEventListener implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {

    private Logger logger = LoggerFactory.getLogger(MyApplicationEnvironmentPreparedEventListener.class);

    // 在该监听中获取到ConfigurableEnvironment后可以对配置信息做操作，例如：修改默认的配置信息，增加额外的配置信息等等
    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
        ConfigurableEnvironment environment = event.getEnvironment();
        MutablePropertySources propertySources = environment.getPropertySources();
        if (propertySources != null) {
            Iterator<PropertySource<?>> iterator = propertySources.iterator();
            while (iterator.hasNext()) {
                PropertySource<?> ps = iterator.next();
                logger.info("ps.getName:{};ps.getSource:{};ps.getClass:{}", ps.getName(), ps.getSource(), ps.getClass());
            }
        }
    }
}
