//Java Program to implement bitwise operators
import java.io.*;
class BitOp
{
    public static void main(String args[])
    {
        int d= 0b11010;
        int e= 0b1100;
        System.out.println("d&e:"+(d&e));
        System.out.println("d|e:"+(d|e));
        System.out.println("d^e:"+(d^e));
        System.out.println("~d:"+(~d));
    }
}

/* Output
d&e:8
d|e:30
d^e:22
~d:-27 

 */