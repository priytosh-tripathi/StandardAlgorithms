import java.io.*;
import java.util.*;
class coin_change
{
    public static void main(String args[])throws Exception
    {
      DataInputStream in = new DataInputStream(System.in);
      //System.out.println("Enter size of Coin Array and the Value for which change is required");
      String line = in.readLine();
      String strs1[] = line.trim().split("\\s+");
      int n = Integer.parseInt(strs1[0]); int m = Integer.parseInt(strs1[1]);
      //System.out.println("Enter the Coins");
      line = in.readLine();
      String strs[] = line.trim().split("\\s+");
      int coins[] = new int[m];
      for(int i=0;i<m;i++)
       coins[i] = Integer.parseInt(strs[i]);
      System.out.println(change(coins,m,n));
    }

    static long change(int S[],int M, int N)
    {
        long ans[] = new long[N+1];
        Arrays.fill(ans,0);

        ans[0]=1;  // base case 1 way to get sum of 0

        for(int i=0;i<M;i++)
           for(int j=S[i];j<=N;j++)
              ans[j] = ans[j]+ans[j-S[i]];

        return ans[N];
    }
}