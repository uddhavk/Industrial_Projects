// create a new file by user input and FileOutputStream its for writing the data in file
import java.io.*;
import java.util.*;

class program570
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
            FileOutputStream foobj = new FileOutputStream(fobj);
            String str = "Jay Ganesh...";

            byte Arr[] = str.getBytes(); // IMP

            System.out.println("Length of Arr is : "+Arr.length);

            foobj.write(Arr);
        }
        else
        {
            System.out.println("There is no such file");
        }   

        sobj.close();
    }
}