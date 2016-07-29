package com.puhui.tinyspring.reader;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

/**
 * Created by puhui on 2016/7/29.
 * 资源读取器
 */
public interface ResourceReader {

    /**
     * 根据名称获取值
     * @param name 名称
     * @return 名称对应的值
     */
    String getValue(String name) throws URISyntaxException, MalformedURLException;

    /**
     * 在 parent 节点下面获取指定节点的值
     * @param name 指定节点
     * @param parent 父节点
     * @return value
     */
    String getValue(String name, String parent) throws URISyntaxException, MalformedURLException;
}
