import java.io.*;
import java.util.*;
class uni_substring
{
    public static void main(String args[])throws Exception
    {
        DataInputStream in = new DataInputStream(System.in);
        //Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String n = in.readLine();
        HashSet<String> hs = new HashSet<String>();
        int len = n.length();

        for(int i=0;i<len;i++)
        {
            char a = n.charAt(i);
            String ans ="";
            ans = ans+a;
            hs.add(ans);
            int x = n.length();
            if(i>0 && i<(x-1))
            {
                int c=1;ans="";String temp1=""; String temp2="";char t1='1'; char t2='2';
                while(true){
                    if(((i-c)>0)&&((i+c)<x)){
                    t1 = n.charAt(i-c);
                    t2 = n.charAt(i+c);
                    if(t1==t2){
                      ans = n.substring((i-c),(i+c+1));
                      hs.add(ans);
                      c++;
                      continue;
                    }
                    else{
                       if(t1==a){
                           temp1 = temp1+t1+a;
                           hs.add(temp1);
                       }
                       if(t2==a){
                           temp2 = temp2+t2+a;
                           hs.add(temp2);
                       }
                       break;
                    }
                  }
                  else 
                   break;
                }
            }
        }
        System.out.println(hs);
      
    }
}