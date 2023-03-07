package com.throadTest;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ThreadTest02 {
    //给线程设置名字
    public static void main(String[] args) {
        PrintNumberThread printNumberThread = new PrintNumberThread();
        Thread thread = new Thread(printNumberThread);
        thread.setName("printNumberRunnable");
        thread.start();
    }
}
