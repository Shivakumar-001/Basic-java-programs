import java.io.*;
class Animal
{
    public void move(){System.out.println("Animals can move");}
}
class Dog extends Animal
{
    public void move(){System.out.println("Dog can Walk and run");}
}
public class Test3
{
    public static void main(String args[])
    {
        Dog d = new Dog();
        d.move();
    }
}

/*OUTPUT
Dog can walk and run

 */