package com.optionalTest;

import java.util.Optional;

public class OPtionalTest {
    /**
     * optional类
     * 是一个可以为null的容器对象，可以保存指定类型的值，也可以只保存null，要么有值，要么为null
     *
     * optional中提供很多方法来避免显示的进行空值检查，如果值存在则调用 isPresent()方法会返回true,
     * 调用get()方法就会返回这个对象
     *
     * optional类是一个没有子类的工具类，很好的解决空指针异常问题
     */

    //OPtional对象的创建
    //of()方法不支持null对象
    //ofNullable() 方法支持null对象
    //empty() 方法可以直接创建一个空的Optional对象


    /**
     * Optional常用的方法
     *
     * isPresent():判断是否包含值
     * 如果包含值则返回true
     * 如果不包含则返回false
     *
     */
    Optional<Object> optional = Optional.empty();
    // false
    boolean optionalPresent = optional.isPresent();

    Optional<String> optionaltest = Optional.of("java8");

}
