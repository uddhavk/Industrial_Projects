//Encryption Decryption
class program588
{
    public static void main() throws Exception
    {
        String str = "Hello";

        byte Arr[] = str.getBytes();

        System.out.println("Original data : "+str);
 
        byte key = 0x11;

        // Encryption process
        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = (byte)(Arr[i] ^ key);
        }

        String output = new String(Arr);

        System.out.println("Encrypted data : "+output);
        
        
         // Decryption process
        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = (byte)(Arr[i] ^ key);
        }

        String out = new String(Arr);
        
        System.out.println("Decryption data : "+out);
    }
}