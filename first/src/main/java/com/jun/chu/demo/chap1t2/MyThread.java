package com.jun.chu.demo.chap1t2;

/**
 * Created by chujun on 2018/4/28.
 */
public class MyThread extends Thread {
    private int count = 5;

    public MyThread() {
    }

    public MyThread(String name) {
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
        MyThread a = new MyThread("A1");
        MyThread b = new MyThread("B1");
        MyThread c = new MyThread("C1");
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

        System.out.println("多线程公用同一个线程,线程不安全,开始");

        MyThread myThread = new MyThread();
        //公用同一个线程
        Thread a2 = new Thread(myThread, "A2");
        Thread b2 = new Thread(myThread, "B2");
        Thread c2 = new Thread(myThread, "C2");
        Thread d2 = new Thread(myThread, "D2");
        Thread e2 = new Thread(myThread, "E2");
        a2.start();
        b2.start();
        c2.start();
        d2.start();
        e2.start();
        //        由A 计算.count= 3
        //        由B 计算.count= 3
        //        由C 计算.count= 2
        //        由D 计算.count= 1
        //        由E 计算.count= 0
    }
}
