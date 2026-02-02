//Encryption --> using XOR(^)
class program586
{
    public static void main() throws Exception
    {
        int No = 21;
        int Ans = 0;

        Ans = No ^ 11;
        
        System.out.println("Encrypted data : "+Ans);
        
        // problem
        Ans = Ans ^ 11;

        System.out.println("Decrypted data : "+Ans);
    }
}