package com.jun.chu.demo.chap1.isAliveMethod;

/**
 * Created by chujun on 2018/4/28.
 */
public class IsAlive2Thread extends Thread {
    public IsAlive2Thread() {
        printInfo("IsAlive2Thread constructor");
    }

    private void printInfo(String method) {
        System.out.println(method + " -- begin");
        System.out.println("Thread.currentThread().getName() : " + Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive(): " + Thread.currentThread().isAlive());
        System.out.println("this.getName():" + this.getName());
        System.out.println("this.isAlive():" + this.isAlive());
        System.out.println(method + " -- end");
    }

    @Override
    public void run() {
        super.run();
        printInfo("run");
    }

    public static void main(String[] args) {
        IsAlive2Thread isAlive2Thread = new IsAlive2Thread();
        Thread thread = new Thread(isAlive2Thread);
        System.out.println("main begin thread.isAlive():" + thread.isAlive());
        thread.setName("A");
        thread.start();
        System.out.println("main end thread.isAlive():" + thread.isAlive());

        //        IsAlive2Thread constructor -- begin
        //        Thread.currentThread().getName() : main
        //        Thread.currentThread().isAlive(): true
        //        this.getName():Thread-0
        //        this.isAlive():false
        //        IsAlive2Thread constructor -- end
        //        main begin thread.isAlive():false
        //        main end thread.isAlive():true
        //        run -- begin
        //        Thread.currentThread().getName() : A
        //        Thread.currentThread().isAlive(): true
        //        this.getName():Thread-0
        //TODO:cj 这一步run方法中this.isAlive():仍然返回false,不太理解
        //        this.isAlive():false
        //        run -- end
    }
}
