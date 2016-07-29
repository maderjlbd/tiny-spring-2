package com.puhui.tinyspring.utils;

import org.junit.Test;

import java.io.File;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by puhui on 2016/7/29.
 * Test for DomUtils
 */
public class DomUtilsTest {

    @Test
    public void testGetBeanValues() throws Exception {
        File file = new File("F:\\projects\\tiny-spring\\src\\main\\resources\\beans.xml");
        DomUtils domUtils = new DomUtils(file);
        List<String> values = domUtils.getBeanValues();
        System.out.println(values.size());
    }
}