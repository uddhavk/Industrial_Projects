// create a new file by user input and read the data from the file
import java.io.*;
import java.util.*;

class program565
{
    public static void main() throws Exception
    {
        String FileName = null;
        File fobj = null;
        FileReader frobj = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file :");
        FileName = sobj.nextLine();

        fobj = new File(FileName);

        if(fobj.exists())
        {             
            frobj = new FileReader(FileName);

            System.out.println((char)frobj.read());
            System.out.println((char)frobj.read());
            System.out.println((char)frobj.read());
        }
        else
        {
            System.out.println("There is no such file");
        }

        if(frobj != null)
        {
            frobj.close();   
        }
        

        sobj.close();
    }
}