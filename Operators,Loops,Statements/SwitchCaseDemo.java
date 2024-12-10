//Java Program to implement Switch case Statement
import java.io.*;
class SwitchCaseDemo
{
    public static void main(String args[])
    {
        int age=2;
        switch(age)
        {
            case 1: System.out.println("You are one year old");break;
            case 2: System.out.println("You are two year old");break;
            default: System.out.println("You are more than two year old");
        }
    }
}

//Output : You are two years old