import java.io.*;
import java.util.*;
class dp_ugly_number
{
    public static void main(String args[])throws IOException
    {
      DataInputStream in = new DataInputStream(System.in);
      System.out.println("Enter the Value of N, which is the Nth Ugly number you want");
      int n = Integer.parseInt(in.readLine());
      dp_ugly_number ob = new dp_ugly_number();
      ob.ugly(n);
    }

    public void ugly(int n)
    {
        int ug[] = new int[n];
        int i2=0;int i3=0;int i5=0;
        int nm2=2;
        int nm3=3;
        int nm5=5;
        int nun = 1;

        ug[0]=1;
        for(int i=1;i<n;i++)
        {
            nun = Math.min(nm2,Math.min(nm3,nm5));
            ug[i] = nun;
            if(nun==nm2)
            {
              i2=i2+1;
              nm2=ug[i2]*2;
            }
            if(nun==nm3)
            {
              i3=i3+1;
              nm3=ug[i3]*3;
            }
            if(nun==nm5)
            {
              i5=i5+1;
              nm5=ug[i5]*5;
            }
        }
        System.out.println(nun);
    }
}