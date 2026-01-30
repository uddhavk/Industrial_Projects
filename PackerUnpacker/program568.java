// create a new file by user input and calling some functions
import java.io.*;
import java.util.*;

class program568
{
    public static void main() throws Exception
    {
        String FileName = null;
        boolean bRet = false;
        File fobj = null;


        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file :");
        FileName = sobj.nextLine();

        fobj = new File(FileName);

        if(fobj.exists())
        {             
            System.out.println("File Name : "+fobj.getName());
            System.out.println("File path : "+fobj.getAbsolutePath());
            System.out.println("File size : "+fobj.length());
        }
        else
        {
            System.out.println("There is no such file");
        }   

        sobj.close();
    }
}