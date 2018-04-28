package com.jun.chu.demo.chap1t2;

/**
 * Created by chujun on 2018/4/28.
 */
public class NotThreadSafeThread extends Thread {
    private int count = 5;

    @Override
    public void run() {
        super.run();
        count--;
        System.out.println("由" + currentThread().getName() + " 计算.count= " + count);
    }

    public static void main(String[] args) {
        NotThreadSafeThread myThread = new NotThreadSafeThread();
        Thread a = new Thread(myThread, "A");
        Thread b = new Thread(myThread, "B");
        Thread c = new Thread(myThread, "C");
        Thread d = new Thread(myThread, "D");
        Thread e = new Thread(myThread, "E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
        //        由A 计算.count= 3
        //        由B 计算.count= 3
        //        由C 计算.count= 2
        //        由D 计算.count= 1
        //        由E 计算.count= 0
    }
}
