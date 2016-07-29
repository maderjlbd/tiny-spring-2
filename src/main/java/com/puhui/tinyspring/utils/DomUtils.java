package com.puhui.tinyspring.utils;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by puhui on 2016/7/29.
 * The utils of Dom
 */
public class DomUtils {

    private static final String BEANS = "beans"; // beans 节点
    private static final String BEAN = "bean"; // bean 节点
    private static final String CLASS = "class"; // bean 节点的 class 属性
    private File file;

    public DomUtils(File file) {
        this.file = file;
    }

    /**
     * 获得所有的带 bean 标示的 Element
     *
     * @return Element 集合
     * @throws DocumentException
     */
    private List<Element> getBeanElements() throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(file);
        Element root = document.getRootElement();
        // 得到名称为 bean 的节点
        List<Element> elements = root.elements(BEAN);
        List<Element> result = new ArrayList<>();
        for (Element ele : elements) {
            if (ele.attribute(CLASS) != null) {
                result.add(ele);
            }
        }
        return result;
    }

    /**
     * 得到指定标签下面的 class 属性的值。
     *
     * @return class 属性集合
     * @throws DocumentException
     */
    public List<String> getBeanValues() throws DocumentException {
        List<Element> beanElements = this.getBeanElements();
        List<String> result = new ArrayList<>(beanElements.size());
        for (Element beanElement : beanElements) {
            result.add(beanElement.attributeValue(CLASS));
        }
        return result;
    }


}
