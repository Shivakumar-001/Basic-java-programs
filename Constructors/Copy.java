import java.io.*;
class Hello
{
    String name;
    Hello(String name)
    {
        this.name=name;
    }
}
class Copy
{
    public static void main(String args[])
    {
        Hello k1 = new Hello("Java");
        System.out.println("Name:"+k1.name);
        Hello k2 = new Hello(k1);
        System.out.println("Copy Constructor Used Second Object");
        System.out.println("Name:"+k2.name);
    }
}


/*
Output
Name:Java
Copy Constructor Used Second Object
Name: Java

 */