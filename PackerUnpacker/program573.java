// create a new file by user input and FileInputStream its used for read the data from the file
// Read All data from given file
import java.io.*;
import java.util.*;

class program573
{
    public static void main() throws Exception
    {
        int iRet = 0;

        String FileName = null;
        byte Arr[] = new byte[100];

        boolean bRet = false;
        File fobj = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file :");
        FileName = sobj.nextLine();

        fobj = new File(FileName);

        if(fobj.exists())
        {  
            FileInputStream fiobj = new FileInputStream(fobj);


            iRet = fiobj.read(Arr);

            String str = new String(Arr);   // IMP

            System.out.println("iRet = "+iRet); 
            System.out.println(str); 
            
        }
        else
        {
            System.out.println("There is no such file");
        }   

        sobj.close();
    }
}