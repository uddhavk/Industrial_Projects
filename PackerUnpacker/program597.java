// String Functions
import java.io.*;
import java.util.*;

class program597
{
    public static void main() throws Exception
    {
        String str = "     Marvellous     ";
        
        System.out.println("Data : "+str);
        System.out.println("Length : "+str.length());
        
        // Remove the white spaces from starting and ending
        str = str.trim();

        System.out.println("Data : "+str);
        System.out.println("Length : "+str.length());
        
        
    }
}