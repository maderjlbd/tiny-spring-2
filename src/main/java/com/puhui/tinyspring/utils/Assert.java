package com.puhui.tinyspring.utils;

/**
 * Created by wentong on 2016/7/23.
 * 断言模拟类，用来判断参数是否合法
 */
public class Assert {
    private Assert() {
    }

    /**
     * 判断指定对象是否为空，如果为空，抛出异常并且提示报错信息
     *
     * @param object  待检测对象
     * @param message 提示消息
     */
    public static void isNull(Object object, String message) {
        if (object == null) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * 检测表达式合法性
     * @param expression 表达式
     * @param message 提示信息
     */
    public static void isTrue(boolean expression,String message) {
        if (!expression) {
            throw new IllegalArgumentException(message);
        }
    }
}
