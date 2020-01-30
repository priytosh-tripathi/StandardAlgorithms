<<<<<<< HEAD
import java.util.*;
import java.io.*;
class rain
{
    public static void main(String args[])throws Exception
    {
      DataInputStream in = new DataInputStream(System.in);
      int n = Integer.parseInt(in.readLine());
      int A[] = new int[n];
      String line = in.readLine();
      String strs[] = line.trim().split("\\s+"); 
      for(int i=0;i<n;i++)
       A[i]=Integer.parseInt(strs[i]);
      int ans=0;
      int left[] = new int[n];
      int right[] = new int[n];
      left[0] = A[0];
      for(int i=1;i<n;i++)
       left[i] = Math.max(left[i-1],A[i]);
      right[n-1] = A[n-1];
      for(int i=n-2;i>=0;i--)
       right[i] = Math.max(right[i+1],A[i]);
      
       for(int i=0;i<n;i++)
        ans = ans+Math.min(left[i],right[i])-A[i];

      System.out.println(ans);
    }
=======
import java.util.*;
import java.io.*;
class rain
{
    public static void main(String args[])throws Exception
    {
      DataInputStream in = new DataInputStream(System.in);
      int n = Integer.parseInt(in.readLine());
      int A[] = new int[n];
      String line = in.readLine();
      String strs[] = line.trim().split("\\s+"); 
      for(int i=0;i<n;i++)
       A[i]=Integer.parseInt(strs[i]);
      int ans=0;
      int left[] = new int[n];
      int right[] = new int[n];
      left[0] = A[0];
      for(int i=1;i<n;i++)
       left[i] = Math.max(left[i-1],A[i]);
      right[n-1] = A[n-1];
      for(int i=n-2;i>=0;i--)
       right[i] = Math.max(right[i+1],A[i]);
      
       for(int i=0;i<n;i++)
        ans = ans+Math.min(left[i],right[i])-A[i];

      System.out.println(ans);
    }
>>>>>>> 3de4da818b80ea4267bb81b4bdf8166f76d9dcb9
}