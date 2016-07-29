package com.puhui.tinyspring.utils;

/**
 * Created by puhui on 2016/7/29.
 * 路径工具类
 */
public final class PathUtils {
    private PathUtils(){}

    public static String getProjectPath() {
        return System.getProperty("user.dir");
    }

    public static String getPackagePath(Class clazz) {
        return clazz.getPackage().getName();
    }
}
