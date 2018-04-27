package com.jun.chu.demo.createThread;

import com.jun.chu.demo.createThread.MyThread;
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
        //多次调用start方法会抛出java.lang.IllegalThreadStateException
        myThread.start();
        try {
            myThread.start();
        } catch (Exception e) {

        }
    }
}
