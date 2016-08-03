package com.puhui.tinyspring.utils;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by puhui on 2016/7/29.
 * The utils of Dom
 */
public class DomUtils {

    private static final String BEAN = "bean"; // bean 节点
    private static final String DEFAULT_CLASS = "class"; // bean 节点的 class 属性
    private File file;

    /**
     * 通过文件构造 DomUtils
     *
     * @param file 文件
     */
    public DomUtils(File file) {
        this.file = file;
    }

    /**
     * 获得所有的带 bean 标示的 Element
     *
     * @return Element 集合
     * @throws DocumentException
     */
    @SuppressWarnings("unchecked")
    private List<Element> getBeanElements(String beanName, String nodeName) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(file);
        Element root = document.getRootElement();
        // 得到名称为 bean 的节点
        List<Element> elements = root.elements(beanName);
        List<Element> result = new ArrayList<>();
        for (Element ele : elements) {
            if (ele.attribute(nodeName) != null) {
                result.add(ele);
            }
        }
        return result;
    }

    /**
     * 得到指定标签下面的 class 属性的值。
     *
     * @param name 标签名
     * @param nodeName 属性名
     * @return class 属性集合
     * @throws DocumentException
     */
    public List<String> getBeanValues(String name,String nodeName) throws DocumentException {
        if (name == null || name.isEmpty()) {
            return Collections.emptyList();
        }
        List<Element> beanElements = this.getBeanElements(name,nodeName);
        List<String> result = new ArrayList<>(beanElements.size());
        for (Element beanElement : beanElements) {
            result.add(beanElement.attributeValue(name));
        }
        return result;
    }
}
