import java.util.*;
import java.io.*;
class string_token
{
    public static void main(String args[])throws Exception
    {
        DataInputStream in = new DataInputStream(System.in);
        System.out.println("Enter the String");
        String n= in.readLine();
        System.out.println("Enter the Delimiter");
        char del = (in.readLine()).charAt(0);
        String A=""; n=n+del;
        for(int i=0;i<n.length();i++)
        {
            if(n.charAt(i)==del)
             {
                 System.out.println(A);
                 A="";
             }
            else
            {
                A=A+(n.charAt(i));
            }
        }
    }
}