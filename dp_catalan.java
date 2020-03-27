import java.io.*;
class dp_catalan
{
    public static void main(String args[])throws Exception
    {
        DataInputStream in = new DataInputStream(System.in);
        System.out.println("Enter the Value of N, where N is the Nth Catalan Number required");
        int n = Integer.parseInt(in.readLine());
        dp_catalan ob = new dp_catalan();
        ob.catalan(n);
    }

    public void catalan(int n)
    {
        int cat[] = new int[n+2];
        cat[0]=1;
        cat[1]=1;

        for(int i=2;i<=n;i++)
        {
            cat[i]=0;
            for(int j=0;j<i;j++)
            {
                cat[i]=cat[i]+(cat[j]*cat[i-j-1]);
            }
        }
        System.out.println(cat[n-1]);
    }
}