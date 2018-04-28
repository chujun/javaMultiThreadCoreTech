package com.jun.chu.demo.createThread.chap1t2;

import com.jun.chu.demo.chap1t2.My2Thread;
import org.junit.Test;

/**
 * Created by chujun on 2018/4/28.
 */
public class My2ThreadTest {
    @Test
    public void test_Thread_currentThread_method() {
        My2Thread my2Thread = new My2Thread("A");
        my2Thread.start();
    }
}
