import java.io.FileWriter;
import java.io.IOException;
public class WriteToFile
{
    public static void main(String args[])
    {
        try{
            FileWriter myWriter = new FileWriter("Test.txt");
            myWriter.write("Welcome to java Programming");
            myWriter.close();
            System.out.println("Successfully Wrote to a file");

        }
        catch(IOException e)
        {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}

//Inside file : "Welcome to java Programming"

//OUTPUT:Successfully Wrote to a file