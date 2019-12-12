import java.util.*;
import java.io.*;

class stockMarket{

  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a[] = new int[n+1];
    for(int i = 0; i < n; i++)
      a[i] = in.nextInt();
    a[n] = 0;
    int totalProfit = 0;
    int maxProfit = 0;
    int base = a[0];
    int baseIndex = 0;

    for(int i = 0; i < n+1; i++)
    {
      if(base < a[i])
        maxProfit = a[i] - base;
      if(base > a[i])
        {
          totalProfit = totalProfit + maxProfit;
          if(baseIndex != (i-1))
          System.out.println("buy at " + baseIndex +" sell at " + (i-1));
          base = a[i];
          baseIndex = i;
        }
    }
    System.out.println("Total Profit is : " + totalProfit);

  }
}
