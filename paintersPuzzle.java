import java.util.*;
import java.io.*;

class paintersPuzzle{

    public static void main(String args[]) throws Exception{
        DataInputStream in = new DataInputStream(System.in);
        String line = in.readLine();
        String str1[] = line.trim().split("\\s+");

        int n = Integer.parseInt(str1[0]);
        int k = Integer.parseInt(str1[1]);
        int a[] = new int[n];

        line = in.readLine();
        String str[] = line.trim().split("\\s+");
        for(int i = 0; i < a.length; i++)
            a[i] = Integer.parseInt(str[i]);
        
        int l = 0; 
        int r = 0;
        for(int i = 0; i < a.length; i++){
            if(l < a[i]) l = a[i];
            r+=a[i];
        }
        int m = 0;
        int c = 0;
        int ans = 0;
        while(l < r){
            m = (l+r)/2;
            c = paintersReq(a,m);

            
            if(c > k) l = m+1;
            else if(c < k) r = m-1;
            else if(c == k)
                {
                    ans = m;
                    r = m-1;
                }

        }
        System.out.println(ans);
    }

    static int paintersReq(int a[], int m){
        int count = 1;
        int sum = 0; 
        for(int i = 0; i < a.length; i++){
            sum+=a[i];
            if(sum <= m)
                continue;
            else    
                {
                    count++;
                    sum = a[i];
                }    
        }
        return count;
    }
}