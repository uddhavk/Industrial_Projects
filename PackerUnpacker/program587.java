//Encryption 
class program587
{
    public static void main() throws Exception
    {
        String str = "Hello";

        byte Arr[] = str.getBytes();

        System.out.println("Original data : "+str);

        byte key = 0x11;

        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = (byte)(Arr[i] ^ key);
        }

        String output = new String(Arr);

        System.out.println("Encrypted data : "+output);
    }
}
