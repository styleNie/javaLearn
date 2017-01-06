package com.exception;

/**
 * Created by Administrator on 2016/10/17.
 * 多线程异常处理
 */

class MyThread extends Thread{
    public void run(){
        System.out.println("Throwing in " +"MyThread");
        throw new RuntimeException();
    }
}

public class MutilThread {
    public static void main(String[] args){
        MyThread t = new MyThread();
        t.start();
        try{
            Thread.sleep(1000);
        }
        catch (Exception x){
            System.out.println("Caught it" + x);
        }
        System.out.println("Exiting main");
    }
}
