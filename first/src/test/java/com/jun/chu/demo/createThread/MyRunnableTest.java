package com.jun.chu.demo.createThread;

import org.junit.Test;

/**
 * Created by chujun on 2018/4/27.
 */
public class MyRunnableTest {
    @Test
    public void test_myRunnable(){
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("运行结束");
    }
}
