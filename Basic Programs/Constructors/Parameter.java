import java.io.*;
class Parameter
{
    Parameter(String name)
    {
        System.out.println("Hello"+name);
    }
    public static void main(String args[])
    {
        Parameter obj = new Parameter("Java");
    }
}

//OUTPUT : Hello JAVA