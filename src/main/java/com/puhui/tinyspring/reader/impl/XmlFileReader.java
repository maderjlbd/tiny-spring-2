package com.puhui.tinyspring.reader.impl;

import com.puhui.tinyspring.reader.ResourceReader;
import com.puhui.tinyspring.utils.DomUtils;
import org.dom4j.DocumentException;

import java.io.File;
import java.net.MalformedURLException;
import java.util.List;

/**
 * Created by zhouwentong on 2016/7/29.
 * 针对 xml 文件的读取器。
 */
public class XmlFileReader implements ResourceReader {
    private final File file;

    public XmlFileReader(File file) {
        this.file = file;
        if (file == null || !file.exists() || !file.canRead()) {
            throw new RuntimeException("This is File isn't exists or equals null!");
        }
    }

    public String getValue(String name) throws MalformedURLException {
        return getValue(name, null);
    }

    public String getValue(String name, String parent) throws MalformedURLException {
//        String path = file.getPath();
//        URL url = new URL(path);

        return null;
    }

    @Override
    public List<String> getValues(String name, File file) throws DocumentException {
        DomUtils domUtils = new DomUtils(file);
        List<String> beanValues = domUtils.getBeanValues(name);
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
//        classLoader.getResources("");new
        for (String beanValue : beanValues) {

        }
        return beanValues;
    }

}
