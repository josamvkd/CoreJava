package com.example.ekfinal;

public class ThreadStopExample implements Runnable {
   public void run(){
       System.out.println("Thread Started running!!!");
    }

    public static void main(String[] args) {
        ThreadStopExample m1 = new ThreadStopExample();
        Thread t1 =new Thread(m1);
        System.out.println("Before start");
        t1.start();
        System.out.println("Thread Started before stop");
        t1.stop();
        System.out.println("After thread stop");

    }
}
