import java.util.*;
class sieve
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        boolean prime[] = new boolean[n+1];
        for(int i=0;i<n;i++)
         prime[i]=true;
        for(int p=2;p*p<=n;p++)
        {
            if(prime[p]==true)
            {
                for(int i=p*p;i<=n;i+=p)
                 prime[i]=false;
            }
        }
        int c=0;
        System.out.println("Prime numbers are ");
        for(int i=2;i<=n;i++)
        {
            if(prime[i]==true)
            {
                 System.out.print(i+" , ");
                 c++;
            }
        }
        System.out.println();
        System.out.println("Total Prime numbers "+c);
        
    }
}