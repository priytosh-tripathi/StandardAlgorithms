import java.util.*;
class train
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Timings");
        int time = sc.nextInt();
        int arr[] = new int[time];
        int dep[] = new int[time];
        System.out.println("Enter Arrival Times");
        for(int i=0;i<time;i++)
         arr[i]=sc.nextInt();
         System.out.println("Enter Departure Times");
         for(int i=0;i<time;i++)
         dep[i]=sc.nextInt();
        Arrays.sort(arr);
        Arrays.sort(dep);
        int max = 1;
        int curr = 1;
        int i=1; int j=0;
        while(i<time && j<time)
        {
            if(arr[i]<=dep[j]){
                curr++;
                i++;
                max=curr>max?curr:max;
            }
            else{
                curr--;
                j++;
            }
        }
        System.out.println("Platform needed is = "+max);
    }
}