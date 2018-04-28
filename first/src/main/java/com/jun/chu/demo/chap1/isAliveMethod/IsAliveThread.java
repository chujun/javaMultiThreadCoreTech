package com.jun.chu.demo.chap1.isAliveMethod;

/**
 * Created by chujun on 2018/4/28.
 */
public class IsAliveThread extends Thread {
    @Override
    public void run() {
        super.run();
        //isAlive()测试线程是否处于活动状态(线程已经启动且尚未终止),线程处于正在运行或准备开始运行的状态,就认为线程是"存活"的
        System.out.println("run =" + this.isAlive());
    }

    public static void main(String[] args) {
        IsAliveThread isAliveThread = new IsAliveThread();
        System.out.println("begin == " + isAliveThread.isAlive());
        isAliveThread.start();
        System.out.println("end == " + isAliveThread.isAlive());

        //one condition(isAliveThread first end)
        //        begin == false
        //        run =true
        //        end == false

        //also may be this condition(main thread first end)
        //        begin == false
        //        end == true
        //        run =true
    }
}
