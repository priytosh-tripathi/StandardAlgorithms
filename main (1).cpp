/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;

int main()
{
    int i,j,n,max,sum=0,k,l;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++)
    cin>>a[i];
    max=a[0];
    k=0;
    for(i=1;i<n;i++)
    {
        if(a[i]<0)
        {
            if(a[i]>max)
            {
                max=a[i];
                k=l=i;
            }
            else
            sum+=a[i];
        }
        else
        {   
            max=sum=a[i];
            k=i;
            for(j=i+1;j<n;j++)
            {
               if(a[j]>0)
               {
                   if(sum>0)
                   {
                        max=sum+a[j];
                        sum=max;
                        l=j;
                   }
                   else
                   {
                        max=sum=a[j];
                        k=l=j;
                   }
               }
               else
               {
                   sum+=a[j];
               }
            }
            break;
        }
        
    }
    cout<<endl<<k<<"\t"<<l<<"\t"<<max<<endl;
    return 0;
}
