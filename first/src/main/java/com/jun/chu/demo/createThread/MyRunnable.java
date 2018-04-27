package com.jun.chu.demo.createThread;

/**
 * Created by chujun on 2018/4/27.
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("MyRunnable 运行中");
    }
}
