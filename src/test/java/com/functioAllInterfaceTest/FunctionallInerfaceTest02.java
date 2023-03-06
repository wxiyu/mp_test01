package com.functioAllInterfaceTest;

import org.assertj.core.util.Lists;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
public class FunctionallInerfaceTest02 {
    /**
     * Consumer<T>:消费型接口    主要针对的是消费（1....N入参，无返回）这个场景
     * 通过泛型定义了一个入参，但是没有返回值，他代表你可以针对这入参做一些自定义逻辑
     *
     */
    List<String> list = Lists.newArrayList("1", "2", "3", "4", "5", "6");


    /*List<String> testList = new ArrayList<String>("1");
    List<String> aa = Lists.newArrayList();*/

}
