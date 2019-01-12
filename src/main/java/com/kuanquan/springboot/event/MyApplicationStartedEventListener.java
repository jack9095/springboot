package com.kuanquan.springboot.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

/**
 * https://blog.csdn.net/liaokailin/article/details/48186331
 * spring boot 启动监听类  spring boot启动开始时执行的事件
 */
public class MyApplicationStartedEventListener implements ApplicationListener<ApplicationStartedEvent>{

    private Logger logger = LoggerFactory.getLogger(MyApplicationStartedEventListener.class);

    @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
        SpringApplication springApplication = applicationStartedEvent.getSpringApplication();
//        springApplication.setShowBanner(false);// 不显示banner信息
        logger.info("==MyApplicationStartedEventListener==");
    }
}
