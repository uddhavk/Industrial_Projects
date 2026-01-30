// create a new file by user input 
// Read All data from given file and copy to another file
import java.io.*;
import java.util.*;

class program577
{
    public static void main() throws Exception
    {
        int iRet = 0;

        String FileNameScr = null;
        String FileNameDest = null;

        byte Buffer[] = new byte[1024];

        boolean bRet = false;

        File fobjsrc = null;
        File fobjdest = null;

        String str = null; 
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the name of Source file :");
        FileNameScr = sobj.nextLine();

        System.out.println("Enter the name of Destination file :");
        FileNameDest = sobj.nextLine();

        fobjsrc = new File(FileNameScr);

        if(fobjsrc.exists())
        { 
            fobjdest = new File(FileNameDest);
            fobjdest.createNewFile();

            FileInputStream fiobj = new FileInputStream(fobjsrc);
            FileOutputStream foobj = new FileOutputStream(fobjdest);

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                // System.out.print(str);
                foobj.write(Buffer,0,iRet);

            }
            System.out.println("File Copy successfully");

            fiobj.close();
            foobj.close();
        }
        else
        {
            System.out.println("There is no source file");
        }   

        sobj.close();
    }
}