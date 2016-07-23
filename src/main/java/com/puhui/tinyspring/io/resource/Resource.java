package com.puhui.tinyspring.io.resource;

/**
 * Created by wentong on 2016/7/17.
 * 描述 bean io 的接口
 */
public interface Resource {
    /**
     * 是否存在
     * @return 结果
     */
    boolean exists();

    /**
     * 文件是否可读
     * @return 结果
     */
    boolean isReadable();

    /**
     * 文件是否可写
     * @return 结果
     */
    boolean isWriteable();

    /**
     * 文件是否可以打开
     * @return 结果
     */
    boolean isOpen();
}
