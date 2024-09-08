//istanceof operator
import java.io.*;
class myClass
{
    public static void main(String args[])
    {
        myClass obj = new myClass();
        Boolean result = obj instanceof myClass;
        System.out.println(result);
    }
}

//output : true