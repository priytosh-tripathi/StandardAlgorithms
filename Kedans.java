import java.io.*;
import java.util.*;

class Kedans{

  public static void main(String args[]){

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a[] = new int[n];

    for(int i = 0; i < n; i++)
    {
      a[i] = in.nextInt();
    }
    int sumMax = a[0];

    int k = 0,l = 0;
    for(int i = 0; i < n; i++)
     {
       int sum = a[i];
       for(int j = i+1; j < n; j++)
     {
       sum = sum + a[j];
       if(sum > sumMax)
        {
          sumMax = sum;
          k = i;
          l = j;
        }
      }
     }
    System.out.println("Max sum is : " + sumMax);
    System.out.println("Starting index : " + k);
    System.out.println("Ending index : " + l);
    for(int i = k; i < l+1; i++)
      System.out.print(a[i] + " ");
  }
}
