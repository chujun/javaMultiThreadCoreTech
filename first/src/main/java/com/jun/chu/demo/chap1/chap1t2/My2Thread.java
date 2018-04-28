package com.jun.chu.demo.chap1.chap1t2;

/**
 * Created by chujun on 2018/4/28.
 */
public class My2Thread extends Thread {
    private int count = 5;

    public My2Thread() {
        this(null);
    }

    public My2Thread(String name) {
        super(name);
        this.setName(name);
        System.out.println("构造方法的打印:Thread.currentThread().getName() = " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        super.run();
        while (0 < count) {
            count--;
            System.out.println("由" + currentThread().getName() + "计算.count=" + count);
        }
        System.out.println("run方法的打印:Thread.currentThread().getName() = " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        My2Thread a = new My2Thread("A1");
        My2Thread b = new My2Thread("B1");
        My2Thread c = new My2Thread("C1");
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

        My2Thread myThread = new My2Thread();
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
