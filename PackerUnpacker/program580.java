// folder
import java.io.*;
import java.util.*;

class program580
{
    public static void main() throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of Folder : ");  
        String FolderName = sobj.nextLine();
        
        File fobj = new File(FolderName);
        
        // problem checks for file and folder both
        
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