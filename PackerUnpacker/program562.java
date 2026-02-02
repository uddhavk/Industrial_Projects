// create a new file by user input and write the data in the file
import java.io.*;
import java.util.*;

class program562
{
    public static void main() throws Exception
    {
        String FileName = null;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file :");
        FileName = sobj.nextLine();

        FileWriter fwobj = new FileWriter(FileName);
        fwobj.write("Jay Ganesh...");

        fwobj.close();

        sobj.close();
    }
}