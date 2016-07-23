package com.puhui.tinyspring.io.resource.impl;

import com.puhui.tinyspring.io.resource.Resource;
import com.puhui.tinyspring.utils.StringUtils;

import java.io.File;

/**
 * Created by wentong on 2016/7/23.
 * 包含在 classpath 下面的资源
 */
public class ClassPathResource implements Resource {

    private final String path;
    private Class<?> clazz;
    private ClassLoader classLoader;

    public ClassPathResource(String path, Class<?> clazz, ClassLoader classLoader) {
        StringUtils.isEmpty(path);
        this.path = path;
        this.clazz = clazz;
        this.classLoader = classLoader;
    }

    public boolean exists() {
        return false;
    }

    public boolean isReadable() {
        return false;
    }

    public boolean isWriteable() {
        return false;
    }

    public boolean isOpen() {
        return false;
    }

    public String getFileName() {
        return null;
    }

    public File getFile() {
        return null;
    }

    public final String getPath() {
        return this.path;
    }
}
