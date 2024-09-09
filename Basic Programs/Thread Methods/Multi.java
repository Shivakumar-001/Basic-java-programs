//Java program to demonstrate Thread method
import java.io.*;
import java.lang.*;
class Multi extends Thread
{
    public void run()
    {
        System.out.println("Thread is running... wait for 1000 milliseconds");
    }
    public static void main(String args[])throws Exception
    {
        Multi t1 = new Multi();
        t1.start();
        t1.sleep(1000);
    }
}

//output: Thread is runninng... wait for 1000 milliseconds