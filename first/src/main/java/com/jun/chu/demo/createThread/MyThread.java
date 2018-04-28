package com.jun.chu.demo.createThread;

/**
 * Created by chujun on 2018/4/27.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("My2Thread");
    }
}
