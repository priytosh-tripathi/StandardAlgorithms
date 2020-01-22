/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;
void substring(string,int);
int main()
{
    string a;
    cin>>a;
    for(int i=0;a[i]!='\0';i++)
    {
        if((a[i]>=32&&a[i]<=47)||(a[i]>=58&&a[i]<=64)||(a[i]>=91&&a[i]<=96)||(a[i]>=123&&a[i]<=126))
        cout<<endl<<a[i];
        else
        cout<<a[i];
    }
    //substring(a,0);
    return 0;
}
/*void substring(string a,int i)
{
    string b="";
    if(a[i]=='\0')
    return;
    while(a[i]!='$')
    {
        //if(a[i]=='\0')
    //return;
        b+=a[i++];
    }
    cout<<b<<endl;
    
    string c=""+a[i];
    substring(c,i+1);
}*/
