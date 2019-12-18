import java.util.*;
class array_swap
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the NUmber of elements");
        array_swap ob = new array_swap();
        int n = sc.nextInt();
        int A[] = new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
         A[i]=sc.nextInt();
        System.out.println("The Original Array ");
        ob.printarr(A);
        System.out.println("The rearranged array is ");
         for(int i=0;i<n;i++)
         A[A[i]%n]+=i*n;
         for(int i=0;i<n;i++)
         A[i]/=n;
        ob.printarr(A);
    }
    void printarr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
         System.out.print(arr[i]+" ");
        System.out.println();
        return ;
    }
}