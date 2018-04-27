package com.jun.chu.demo.chap1t2;

/**
 * Created by chujun on 2018/4/27.
 */
public class ThreadSafeThread extends Thread {
    private int count = 5;

    public ThreadSafeThread(String name) {
        super(name);
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (0 < count) {
            count--;
            System.out.println("由" + currentThread().getName() + "计算.count=" + count);
        }
    }
}
