//Multiple Inheritence in java by Interface
import java.io.*;
interface Printable
{
    void print();
}
interface Showable
{
    void show();
}
class Test5 implements Printable,Showable
{
    public void print()
    {
        System.out.println("Hello");
    }
    public void show()
    {
        System.out.println("WelCome");
    }
    public static void  main(String args[])
    {
        Test5 obj = new Test5();
        obj.print();
        obj.show();
    }
}


/*Output : Hello 
Welcome */