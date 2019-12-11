import java.util.*;
//import java.io.*;
class target2                                                            // Egg Dropping Problem 
{
    public static void main(String args[])
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Number of Test cases");
     int test = sc.nextInt();
     while(test-->0)
     {
         System.out.println("Enter the number of floors");
         int k = sc.nextInt();
         System.out.println("Enter the number of eggs");
         int n = sc.nextInt();
         target2 ob = new target2();
         int[][] answer = ob.solution(n,k);
         /*for(int i=0;i<k+1;i++)
          {
              for(int j=0;j<n+1;j++)
               System.out.print(answer[i][j]+" ");
          System.out.println();
          }*/ 
        System.out.println("Minimum Trials required = "+answer[k][n]);
     }         
     sc.close();    
    }
    public int[][] solution(int n, int k)
    {
        final int result[][] = new int[k+1][n+1];
        for(int i = 0;i < k + 1;i++)
           result[i][1] = i;
        for(int i = 0;i< n + 1;i++)
           {
            result[0][i] = 0;   
            result[1][i] = 1;
           }
        for(int i = 2; i <= k; i++)
        {
            for(int j = 2; j <= n; j++)
            {
                result[i][j] = k+1;
               /* if(k<n)
                result[i][j] = k-1;
                else{ */
                for(int x=1; x < i; x++)
                {
                  int brokenEgg = result[x-1][j-1];
                  int safeEgg = result[i-x][j];
                  int temp = Math.max(brokenEgg,safeEgg)+1;
                  if(temp < result[i][j])
                    result[i][j] = temp;
                }
               //}
            }
        }
        
        return result;
    }
}