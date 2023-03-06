package com.mybatisplustest.mapper;
/**
 * 函数式接口测试
 * 概念：有且仅有一个抽象方法的接口
 */
@FunctionalInterface //一旦使用该注解来定义接口，编译器将会强制检查该接口是否确实仅有一个抽象方法，否则会报错
public interface MyFunctionInterface {
    //定义一个抽象方法
    public abstract void methodTest();
    //抽象方法中的public 可省略

//    abstract void methodTest1();

    /*-----------------------------------------------------*/
    //注解    @FunctionalInterface
    //作用：   检测一个接口是否是函数式接口
}
