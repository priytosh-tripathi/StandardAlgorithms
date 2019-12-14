import java.util.*;
//import java.io.*;
class kadane                                                       // Kadane's Algorithm
{
    public static void main(final String args[]) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Test cases");
        int test = sc.nextInt();
        while (test-- > 0 ? true : false) {
            System.out.println("Enter number of elements in the Array");
            final int n = sc.nextInt();
            final int A[] = new int[n];
            boolean flag = false;
            int flag_max = -2147483647;
      System.out.println("Enter elements of Array");
      for(int i=0;i<n;i++)
       {A[i]=sc.nextInt(); if(A[i]>0){flag=false;} flag_max = A[i]>flag_max?A[i]:flag_max;}
      if(flag==true)
       {System.out.println("The Longest contiuous sum = "+flag_max);}
       else{
       int max = -2147483647;      int max_temp = 0;
      for(int i=0;i<n;i++)
      {
          max_temp = max_temp + A[i];
          if(max < max_temp)
           max = max_temp;
          if(max_temp < 0)
           max_temp = 0;
      }
      System.out.println("Largest Continuous sum = "+max);
    }
   }
    sc.close();
    }
}
