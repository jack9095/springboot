package com.kuanquan.springboot.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
//    private @Value("{name:fei}") String name;
    private @Value("${name}") String name;  // 不设置默认读取 application:properties中的数据
    private @Value("${age}") Integer age;   // 不设置默认读取 application:properties中的数据
    private @Value("${remark}") String remark;

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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", remark='" + remark + '\'' +
                '}';
    }
}
