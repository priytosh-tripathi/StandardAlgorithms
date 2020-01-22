/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;

int main()
{
    int n;
    cin>>n;
    int a[n],b[n],c[n];
    for(int i=0;i<n;i++)
    cin>>a[i];
    int max=b[0]=a[0];
    for(int i=1;i<n;i++)
    {
        if(a[i]>max)
        max=b[i]=a[i];
        else
        b[i]=max;
    }
    max=c[n-1]=a[n-1];
    for(int i=n-2;i>=0;i--)
    {
        if(a[i]>max)
        max=c[i]=a[i];
        else
        c[i]=max;
    }
   
    int count=0;
    for(int i=0;i<n;i++)
    {
        count+=(b[i]<c[i]?b[i]:c[i])-a[i];
        
    }
    cout<<count;
    return 0;
}
