import java.util.*;
class kth_bit
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        System.out.println("Enter the value of K");
        int k = sc.nextInt();
        n = (1<<k) | n;
        System.out.println("Answer is = "+n);
    }
}