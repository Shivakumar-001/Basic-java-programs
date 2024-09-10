import java.io.File;
import java.io.IOException;
public class CreateFile
{
    public static void main(String args[])
    {
        try
        {
            File myObj = new File("Test.txt");
            if(myObj.createNewFile())
            {
                System.out.println("File Created:"+myObj.getName()+" "+myObj.getAbsolutePath());
            }
            else
            {
                System.out.println("File already exist");
            }
        }
        catch(IOException e){
            System.out.println("An error occured .");
            e.printStackTrace();
        }
    }
}

//output: File Created:shiva.txt C:\Program Files\Java\bin\Test.txt