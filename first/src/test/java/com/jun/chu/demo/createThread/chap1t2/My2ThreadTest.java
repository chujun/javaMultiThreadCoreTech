package com.jun.chu.demo.createThread.chap1t2;

import com.jun.chu.demo.chap1t2.My2Thread;
import org.junit.Test;

/**
 * Created by chujun on 2018/4/28.
 */
public class My2ThreadTest {
    @Test
    public void test_Thread_currentThread_method_start() {
        My2Thread my2Thread = new My2Thread("A");
        my2Thread.start();
        //        构造方法的打印:Thread.currentThread().getName() = main
        //        由A计算.count=4
        //        由A计算.count=3
        //        由A计算.count=2
        //        由A计算.count=1
        //        由A计算.count=0
        //        run方法的打印:Thread.currentThread().getName() = A

    }

    @Test
    public void test_Thread_currentThread_method_run() {
        My2Thread my2Thread = new My2Thread("A");
        my2Thread.run();
        //        构造方法的打印:Thread.currentThread().getName() = main
        //        由main计算.count=4
        //        由main计算.count=3
        //        由main计算.count=2
        //        由main计算.count=1
        //        由main计算.count=0
        //        run方法的打印:Thread.currentThread().getName() = main

    }
}
