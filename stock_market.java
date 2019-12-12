import java.util.*;
//import java.io.*;
class stock_market                                                       // stock market Problem
{
    public static void main(String args[])
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Number of Test cases");
     int test = sc.nextInt();
     while(test-->0?true:false)
     {
      System.out.println("Enter Number of Days for price list");
      int days = sc.nextInt();
      System.out.println("Enter the Stock Prices");
      int price[] = new int[days+1];
      price[days] = 0;
      for(int i = 0; i < days; i++)
        price[i] = sc.nextInt();
      int profit_index = 0; int base = price[0]; int ans = 0;
      System.out.println("Buy on Day 0");
      for(int i = 1;i < days+1;i++)
      {
          if(price[i]<price[i-1])
          {
              ans=ans+(price[profit_index]-base);
              base=price[i];
              System.out.println("Sell on Day "+profit_index);
              if(i!=days)
              System.out.println("Buy on Day "+i);
          }
          else
              profit_index = i;
      }
      System.out.println("Answer is = "+ans);
      
    }
    }
}
