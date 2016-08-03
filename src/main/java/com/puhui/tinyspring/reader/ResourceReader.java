package com.puhui.tinyspring.reader;

import org.dom4j.DocumentException;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.List;

/**
 * Created by puhui on 2016/7/29.
 * 资源读取器
 */
public interface ResourceReader {

    /**
     * 根据名称获取值
     *
     * @param name 名称
     * @return 名称对应的值
     */
    String getValue(String name) throws URISyntaxException, MalformedURLException;

    /**
     * 在 parent 节点下面获取指定节点的值
     *
     * @param name   指定节点
     * @param parent 父节点
     * @return value
     */
    String getValue(String name, String parent) throws URISyntaxException, MalformedURLException;

    /**
     * 通过指定名称和文件位置获取指定的值
     *
     * @param name     名称
     * @param file     文件
     * @param nodeName 节点名称
     * @return 值集合
     * @throws DocumentException
     */
    List<String> getValues(String name, File file, String nodeName) throws DocumentException;
}
