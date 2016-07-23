package com.puhui.tinyspring.description;

/**
 * Created by wentong on 2016/7/17.
 * Bean 的属性类
 */
public interface BeanDefinition {

    /**
     * 是否是单例
     * @return 结果
     */
    boolean isSingleton();

    /**
     * 是否是多例类
     * @return 结果
     */
    boolean isPrototype();

    /**
     * 获取类名
     * @return 类名
     */
    String getBeanClassName();

    /**
     * 是否是抽象的
     * @return 结果
     */
    boolean isAbstract();

    /**
     * 获取这个 bean 依赖的其他 bean
     * @return 依赖的 bean 的类名的数组
     */
    String[] dependsOn();
}
