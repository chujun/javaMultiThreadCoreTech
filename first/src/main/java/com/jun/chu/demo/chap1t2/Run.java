package com.jun.chu.demo.chap1t2;

/**
 * Created by chujun on 2018/4/27.
 */
public class Run {
    public static void main(String[] args) {
        ThreadSafeThread a = new ThreadSafeThread("A");
        ThreadSafeThread b = new ThreadSafeThread("B");
        ThreadSafeThread c = new ThreadSafeThread("C");
        a.start();
        b.start();
        c.start();
    }
}
