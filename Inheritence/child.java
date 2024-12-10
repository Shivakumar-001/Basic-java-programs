//Java program to implement Single level Inheritenec
import java.io.*;
class parent
{
    public void print_parent()
    {
        System.out.println("printing parent");
    }
    
}
class child extends parent
{
    public void print_child()
    {
        System.out.println("printing child");
    }
    public static void main(String args[])
    {
        child ch = new child();
        ch.print_parent();
        ch.print_child();
    }
}
/*           
OUTPUT

printing parent
printing child

 */