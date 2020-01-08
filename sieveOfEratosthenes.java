import java.util.*;
import java.io.*;

class sieveOfEratosthenes{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a[] = new int[n];

    for(int i = 0; i < n; i++)
      a[i] = i+1;

    for(int i = 2; i <= 9; i++){
      int num = n/i;
      for(int j = 2; j <= num; j++)
        a[i*j-1] = 0;
    }

    for(int i = 1; i < n; i++)
      if(a[i] != 0)
        System.out.print(a[i] + " ");
  }
}
