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

    public static void main(String[] args) {
        ThreadSafeThread a = new ThreadSafeThread("A");
        ThreadSafeThread b = new ThreadSafeThread("B");
        ThreadSafeThread c = new ThreadSafeThread("C");
        a.start();
        b.start();
        c.start();
        //        由A计算.count=4
        //        由A计算.count=3
        //        由A计算.count=2
        //        由A计算.count=1
        //        由A计算.count=0
        //        由B计算.count=4
        //        由B计算.count=3
        //        由B计算.count=2
        //        由B计算.count=1
        //        由B计算.count=0
        //        由C计算.count=4
        //        由C计算.count=3
        //        由C计算.count=2
        //        由C计算.count=1
        //        由C计算.count=0
    }
}
