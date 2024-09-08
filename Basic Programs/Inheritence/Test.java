//Java program to implement Multiple Inheritence
import java.io.*;
import java.lang.*;
import java.util.*;
class One
{
    public void print_one(){System.out.println("ONE");}
}
class Two extends One
{
    public void print_two(){System.out.println("TWO");}
}
class Three extends Two
{
    public void print_three(){System.out.println("Three");}
}
public class Test
{
    public static void main(String args[])
    {
    Three g = new Three();
    g.print_one();
    g.print_two();
    g.print_three();
    }
}

/* OUTPUT
 
ONE
TWO
Three

 */