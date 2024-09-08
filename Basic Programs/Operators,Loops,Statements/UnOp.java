//java Program to implement Unary Operator 
import java.io.*;
class UnOp
{
    public static void main(String args[])
    {
        int a=10,b=10;
        System.out.println("Post Increment: "+(a++));
        System.out.println("Post Decrement: "+(++a));
        System.out.println("Pre Increment: "+(b--));
        System.out.println("Post Increment: "+(--b));
    }
}

/* OutPut
 
Post Increment: 10
Post Decrement: 12
Pre Increment: 10
Post Increment: 8

 */