// create a new file by user input and FileInputStream its used for read the data from the file
import java.io.*;
import java.util.*;

class program572
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
            FileInputStream fiobj = new FileInputStream(fobj);

            byte Arr[] = new byte[50];

            fiobj.read(Arr);

            String str = new String(Arr);   // IMP

            System.out.println(str); 
            
        }
        else
        {
            System.out.println("There is no such file");
        }   

        sobj.close();
    }
}