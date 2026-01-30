// folder
import java.io.*;
import java.util.*;

class program579
{
    public static void main() throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        // problem checks for file and folder both
        File fobj = new File("PPA.txt");
        
        if(fobj.exists())
        {
            System.out.println("Folder is present");
        }
        else
        {
            System.out.println("There is no such Folder");
            
        }
       
        

    }
}