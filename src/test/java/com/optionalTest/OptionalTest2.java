package com.optionalTest;

import com.mybatisplustest.pojo.Studnet;

import java.util.Optional;

public class OptionalTest2 {
    //创建Optional
    //声明一个空的Optional类
    Optional<Object> empty = Optional.empty();
    //依据一个非空值创建Optional类
    Studnet studnet = new Studnet();
    Optional<Studnet> osl = Optional.of(studnet);
    //可接受null的Optional
    Studnet studnet1 = null;
    Optional<Studnet> osl1 = Optional.ofNullable(studnet1);

    //判断Option容器是否包含对象
    /**
     * isPresent不带参数，判断是否为空，ifPresent可以选择带一个消费函数的实例
     */
    //TODO is 和 if 的区别

}
