package com.functioAllInterfaceTest;

import com.mybatisplustest.mapper.MyFunctionInterface;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FunctionallInterfaceTest01 {
    public static void show(MyFunctionInterface myFunctionInterface) {
        myFunctionInterface.methodTest();
    }

    public static void main(String[] args) {
        //调用show方法，方法的参数是一个接口，可以传递接口的实现类对象
        show(new FunctionallInterfaceTest());

        //调用show方法，方法的参数是一个接口，可以传递接口的匿名内部类
        show(new MyFunctionInterface() {
            @Override
            public void methodTest() {
                System.out.println("使用匿名内部类重写接口中的抽象方法");
            }
        });
        //调用show方法，方法的参数是一个接口，可以使用lambda表达式
        show(() -> {
            System.out.println("使用lambda表达式重写接口中的抽象方法");
        });

        //简化lambda表达式
        show(() ->  System.out.println("使用简化的lambda表达式从写接口中的抽象方法") );
    }
}
