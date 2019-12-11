import java.util.*;
import java.io.*;
import java.lang.*;

class eggDropingRecursive{

  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int k = in.nextInt();
    int n = in.nextInt();
    System.out.println(f(k,n));
  }

  static int f(int k, int n)
  {
    if(k == 1)
     return 1;
    if(n == 1)
     return k;
    int min = k + 1;
    for(int x = 1; x < k; x++)
    {
      int a = Math.max(f(k-x,n),f(x-1,n-1)) + 1;
      if(min > a)
        min = a;
    }
    return min;
  }
}
