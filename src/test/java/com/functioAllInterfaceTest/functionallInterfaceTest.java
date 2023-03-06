package com.functioAllInterfaceTest;

import com.mybatisplustest.mapper.MyFunctionInterface;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class functionallInterfaceTest implements MyFunctionInterface {
    //检测方法是否为重写方法
    @Override
    public void methodTest() {
        System.out.println("重写接口中的抽象方法");
    }
}
