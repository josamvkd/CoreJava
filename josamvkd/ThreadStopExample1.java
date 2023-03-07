package com.josamvkd;

public class ThreadStopExample1 extends Thread
{
    public void run(){
        for(int i=1; i<5; i++)
        {
            try
            {
                // thread to sleep for 500 milliseconds
                sleep(500);
                System.out.println(Thread.currentThread().getName());
            }catch(InterruptedException e){System.out.println(""+e);}
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        // creating three threads
        ThreadStopExample1 t1=new ThreadStopExample1 ();
        System.out.println("Thread t1 before start");
        t1.start();
        System.out.println("Thread t1 after start");
        t1.stop();
        System.out.println("Thread t1 is stopped");
    }

}
