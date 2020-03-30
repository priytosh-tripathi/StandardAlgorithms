import java.io.*;
class dp_friends
{
    public static void main(String args[])throws Exception
    {
      DataInputStream in = new DataInputStream(System.in);
      int n = Integer.parseInt(in.readLine());
      int A[] = new int[n+1];
      A[0]=0; A[1]=1;
      for(int i=2;i<n+1;i++)
      {
          A[i] = (i-1)+((i-1)*(A[i-2]));
      }
      System.out.println(A[n]);
    }
}