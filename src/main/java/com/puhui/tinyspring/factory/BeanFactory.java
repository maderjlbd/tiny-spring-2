package com.puhui.tinyspring.factory;

/**
 * Created by wentong on 2016/7/17.
 * 基础类
 * 工厂类，用于生产 bean
 */
public interface BeanFactory {
    /**
     * 根据名称获取 bean
     * @param name 类名
     * @return bean 实体
     */
    Object getBean(String name);

    /**
     * 通过 Class 对象获取 bean
     * @param clazz Class 对象
     * @param <T> 类型
     * @return bean 实体
     */
    <T> T getBean(Class clazz);
}
