import java.util.*;
import java.io.*;

class Kedans2{

  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a[] = new int[n];

    for(int i = 0; i < n; i++)
      a[i] = in.nextInt();

    int sumMax = 0; int sum = 0;
    for(int i = 0; i < n; i++)
    {
      if(a[i] >= 0)
      {
        sum = sum + a[i];
        sumMax = check(sum,sumMax);
      }
      else if(sum != 0)
        {
          sum = sum + a[i];
          sumMax = check(sum, sumMax);
        }
    }

    System.out.println("Max sum is : " + sumMax);
  }

  static int check(int sum, int sumMax)
  {
    if(sum > sumMax)
     return sum;
    return sumMax;
  }
}
