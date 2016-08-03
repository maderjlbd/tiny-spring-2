package com.puhui.tinyspring.reader.impl;

import com.puhui.tinyspring.reader.ResourceReader;
import com.puhui.tinyspring.utils.DomUtils;
import org.dom4j.DocumentException;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.List;

/**
 * Created by puhui on 2016/8/3.
 * 注解 Reader
 */
public class AnnotationFileReader implements ResourceReader {

    @Override
    public String getValue(String name) throws URISyntaxException, MalformedURLException {
        return null;
    }

    @Override
    public String getValue(String name, String parent) throws URISyntaxException, MalformedURLException {
        return null;
    }

    @Override
    public List<String> getValues(String name, File file ,String nodeName) throws DocumentException {
        DomUtils domUtils = new DomUtils(file);
        // name = scan
        List<String> beanValues = domUtils.getBeanValues(name,"");
        for (String beanValue : beanValues) {
        }
        return null;
    }
}
