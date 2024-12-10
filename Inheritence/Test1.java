//Java program to implement Hierarchial Inheritence
import java.io.*;
import java.lang.*;
import java.util.*;
class One
{
    public void print_one(){System.out.println("Class ONE");}
}
class Two extends One
{
    public void print_two(){System.out.println("Class TWO");}
}
class Three extends One
{
    public void print_three(){System.out.println("Class Three");}
}
public class Test1
{
    public static void main(String args[])
    {
        Two obj = new Two();
        obj.print_one();
        obj.print_two();

        Three obj2=new Three();
        obj2.print_one();
        obj2.print_three();
    }
}

/* OUTPUT
Class ONE
Class TWO
Class ONE
Class Three
 */