package com.jun.chu.demo.createThread;

import org.junit.Test;

/**
 * Created by chujun on 2018/4/27.
 */
public class MyThreadTest {
    @Test
    public void testMyThread() {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("运行结束");
    }

    @Test
    public void testMyThread_callMultiStartMethod() {
        MyThread myThread = new MyThread();
        //多次调用start方法会抛出java.lang.IllegalThreadStateException,查看源码即可知道
        myThread.start();
        try {
            myThread.start();
        } catch (Exception e) {

        }
    }
}
