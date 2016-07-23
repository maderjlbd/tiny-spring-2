package com.puhui.tinyspring.io.resource.impl;

import com.puhui.tinyspring.io.resource.Resource;

/**
 * Created by wentong on 2016/7/23.
 */
public class ClassPathResource implements Resource {

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
}
