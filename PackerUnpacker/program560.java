// create a new file by user input and check file exits or not,if exits delete the file
import java.io.*;
import java.util.*;

class program560
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

        bRet = fobj.exists();

        if(bRet == true)
        {
            fobj.delete();
            System.out.println("File gets deleted");
        }
        else
        {            
            System.out.println("There is no such file");
        }

        sobj.close();
    }
}