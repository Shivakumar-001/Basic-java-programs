//Insert method
import java.io.*;
class Insert 
{
    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());  //default 16
        sb.append("Hello");
        System.out.println(sb.capacity()); //now 16
        sb.append("Java is my favourite language");
        System.out.println(sb.capacity()); //now (16*2)+2=34
    }
}

//OUTPUT : 16 16 34

// formula : oldcapacity*2+2;