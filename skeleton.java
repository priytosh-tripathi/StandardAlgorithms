/* -
Legends - A: An Array.
          S: A String Array
          n: Size of the Array A.
          x: an integer variable.
The List of Functions in the Library
1. Take input in an Integer Array - ob.ar_iin(n);
2. Take input in an String Array - ob.ar_sin(n);
3. Take input in an Character Array - ob.ar_cin(n);
4. Take input in an Double Array - ob.ar_din(n);
5. Print the content of an int Array - ob.print_iarr(A);
6. Print the content of an String Array - ob.print_sarr(A);
7. Print the content of a Character Array - ob.print_carr(A);
8. Print the content of a Double Array - ob.print_darr(A);
9. Get the sum of an Integer Array - ob.ar_sum(A);
10. Get the Maximum in an Array  - ob.ar_max(A);
12. Get the Minimum in an Array - ob.ar_min(A);
13. Get the Number of Digits in an Integer - ob.idigits(x);
*/

import java.io.*;
import java.util.*;
class skeleton
{

  public static void main(String args[])throws Exception
  {
    skeleton ob = new skeleton();        
    int test = ob.iin();
    while(test-->0)
    {
        int n = ob.iin();
        int A[] = ob.ar_iin(n);
        System.out.println();
    }
  }

  public int iin()throws Exception
  {
    DataInputStream in = new DataInputStream(System.in);
    int n = Integer.parseInt(in.readLine());
    return n;
  }
  
  public String sin()throws Exception
  {
    DataInputStream in = new DataInputStream(System.in);
    String s = in.readLine();
    return s;
  }
          
  public int[] ar_iin(int n)throws Exception
  { //Take Integer Array as Input
    DataInputStream in = new DataInputStream(System.in);
    //int n = Integer.parseInt(in.readLine());
    String line = in.readLine();
    int A[] = new int[n];
    String strs[] = line.trim().split(" ");
    for(int i=0;i<n;i++)
     A[i] = Integer.parseInt(strs[i]);
    return A;
  }

  public String[] ar_sin(int n)throws Exception
  { //Take Integer Array as Input
    DataInputStream in = new DataInputStream(System.in);
    //int n = Integer.parseInt(in.readLine());
    String line = in.readLine();
    String strs[] = line.trim().split(" ");
    return strs;
  }

  public char[] ar_cin(int n)throws Exception
  { //Take Integer Array as Input
    DataInputStream in = new DataInputStream(System.in);
    //int n = Integer.parseInt(in.readLine());
    String line = in.readLine();
    char A[] = new char[n];
    String strs[] = line.trim().split(" ");
    for(int i=0;i<n;i++)
     A[i] = (strs[i]).charAt(0);
    return A;
  }

  public double[] ar_din(int n)throws Exception
  { //Take Integer Array as Input
    DataInputStream in = new DataInputStream(System.in);
    //int n = Integer.parseInt(in.readLine());
    String line = in.readLine();
    double A[] = new double[n];
    String strs[] = line.trim().split(" ");
    for(int i=0;i<n;i++)
     A[i] = Double.parseDouble(strs[i]);
    return A;
  }

  public void print_iarr(int A[]){
  	for(int i=0;i<A.length;i++)
  	 System.out.print(A[i]+" ");
  	System.out.println();
  }

  public void print_sarr(String A[]){
  	for(int i=0;i<A.length;i++)
  	 System.out.print(A[i]+" ");
  	System.out.println();
  }

  public void print_carr(char A[]){
  	for(int i=0;i<A.length;i++)
  	 System.out.print(A[i]+" ");
  	System.out.println();
  }

  public void print_darr(double A[]){
  	for(int i=0;i<A.length;i++)
  	 System.out.print(A[i]+" ");
  	System.out.println();
  }
  public int ar_sum(int A[])
  { //Find sum of element in an Array
    int sum=0;
    for(int i=0;i<A.length;i++)
     sum=sum+A[i];
    return sum;
  }

  public int ar_max(int A[])
  {
    int max=A[0];
    for(int i=0;i<A.length;i++)
     max=max>A[i]?max:A[i];
    return max;
  }

  public int ar_min(int A[])
  {
    int min=A[0];
    for(int i=0;i<A.length;i++)
     min=min<A[i]?min:A[i];
    return min;
  }

  public int idigits(int n)
  {
    return (int)Math.floor(Math.log10(n) + 1);
  }
  
  public int[] freq(String n)
  {
    n=n.toLowerCase();
    int A[] = new int[26];
    int len = n.length()
    for(int i=0;i<len;i++){
      char a = n.charAt(i);
      int temp = (int)a;
      int val = temp-97;
      A[val]++;
    }
    return A;
  }

}
