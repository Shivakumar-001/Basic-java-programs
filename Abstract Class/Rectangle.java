//Abstract class
import java.io.*;
abstract class Shape
{
    abstract void draw();
}
class Rectangle extends Shape
{
    void draw()
    {
        System.out.println("drawing rectangle");
    }
    public static void main(String args[])
    {
        Rectangle obj = new Rectangle();
        obj.draw();
    }
}

//OUTPUT : drawing rectangle