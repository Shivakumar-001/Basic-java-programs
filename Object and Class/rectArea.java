//Example program for Classes and Objects 
import java.io.*;
class Rectangle
{
    int length,breadth;
    void getData(int x,int y){
        length = x;
        breadth = y;
    }
    int rectArea()
    {
        int rectArea=length * breadth;
        return rectArea;
    }
}
class rectArea{
    public static void main(String[] args)
    {
        int area1,area2;
        Rectangle rect1=new Rectangle();
        Rectangle rect2 = new Rectangle();
        rect1.length=15;
        rect1.breadth=10;
        area1=rect1.length*rect1.breadth;
        rect2.getData(10,20);
        area2=rect2.rectArea();
        System.out.println("Area1="+area1);
        System.out.println("Area2="+area2);
    }
}

/*
Area1=150
Area2=200
 */