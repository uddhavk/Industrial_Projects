// create a new file by user input and FileInputStream its used for read the data from the file
// Read All data from given file
import java.io.*;
import java.util.*;

class program574
{
    public static void main() throws Exception
    {
        int iRet = 0;

        String FileName = null;
        byte Buffer[] = new byte[100];

        boolean bRet = false;
        File fobj = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file :");
        FileName = sobj.nextLine();

        fobj = new File(FileName);

        if(fobj.exists())
        {  
            FileInputStream fiobj = new FileInputStream(fobj);

            // Error
            while((iRet = fiobj.read(Buffer)) != -1)
            {
                System.out.print(new String(Buffer));
            }
            System.out.println();
        }
        else
        {
            System.out.println("There is no such file");
        }   

        sobj.close();
    }
}