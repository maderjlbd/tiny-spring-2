package com.puhui.tinyspring.utils;

/**
 * Created by wentong on 2016/7/23.
 * String 工具类
 */
public class StringUtils {
    private StringUtils() {
    }

    /**
     * 判断字符串是否为空或者长度为 0
     * @param source 待检测字符串
     */
    public static void isEmpty(String source) {
        if (source == null || source.isEmpty()) {
            throw new IllegalArgumentException("传入参数：" + source + "非法。");
        }
    }
}
