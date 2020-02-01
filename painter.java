import java.io.*;
import java.util.*;
class painter
{
    public static void main(String args[])throws Exception
    {
        DataInputStream in = new DataInputStream(System.in);
        //Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N and K");
        String line = in.readLine();
        String strs[] = line.trim().split("\\s+");
        int n = Integer.parseInt(strs[0]);
        int k = Integer.parseInt(strs[1]);
        int A[] = new int[n];
        System.out.println("Enter boards");
        line = in.readLine();
        strs[] = line.trim().split("\\s+");
        int max=0; int sum=0;
        for(int i=0;i<n;i++){
          A[i] = Integer.parseInt(strs[i]);
          sum=sum+A[i];
          max=A[i]>max?A[i]:max;
        }
        
        int low = max;
        int high = sum;
        int ans=high;
        int mid=(low+high)/2;

        while(low<high)
        {
            int r = num(mid,A);
            if(r<=k)
            {
             high=mid-1;
             if(r==k)
                 ans=ans<mid?ans:mid;
            }
            else{
                 low=mid+1;
            }
            mid=(low+high)/2;
            //System.out.println("Stuck here actually");
        }
        System.out.println(ans);
    }

    public static int num(int m, int A[])
    {
        int size = A.length; int sum = 0; int t = 1; int i = 0;
        while(i<size)
        {
            sum=sum+A[i];
            if(sum>m)
            {
                t++; sum=A[i];
            }
            i++;
            //System.out.println("Stuck in this loop");
        }
        return t; 
    }



}