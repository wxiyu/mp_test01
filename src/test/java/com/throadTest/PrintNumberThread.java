package com.throadTest;

public class PrintNumberThread implements Runnable{
    private int number;
    @Override
    public void run() {
        while(number<100){
            System.out.println(Thread.currentThread().getName()+"：输出数字 "+number++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
