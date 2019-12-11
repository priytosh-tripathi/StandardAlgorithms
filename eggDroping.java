import java.util.*;
import java.io.*;
import java.lang.*;

class eggDroping{

  public static void main(String args[]){

    Scanner in = new Scanner(System.in);
    int K = in.nextInt();
    int N = in.nextInt();
    int F[][] = new int[K+1][N+1];

    for(int i = 0; i <= N; i++)
      {
        F[0][i] = 0;
        F[1][i] = 1;
      }
    for(int i = 2; i <= K; i++)
      {
        F[i][1] = i;
      }
    for(int k = 2; k <= K; k++)
      for(int n = 2; n <= N; n++)
      {
        
          int min = K+1;
          for(int x = 1; x < k; x++)
            {
              int a = Math.max(F[k-x][n],F[x-1][n-1]) + 1;
              if(min > a)
                min = a;
            }
          F[k][n] = min;

      }

      for(int i = 0; i < K+1; i++)
        {for(int j = 0; j < N+1; j++)
          System.out.print(F[i][j] + " ");
        System.out.println(" ");}
  }
}
