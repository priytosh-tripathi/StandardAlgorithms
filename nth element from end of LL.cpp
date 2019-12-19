/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;
struct node* head=NULL;
int count=0;
struct node
{
    struct node* next;
    int key,inbound=0;
};
void create(int data)
{
    struct node* n=(struct node*)(malloc(sizeof(struct node)));
    n->key=data;
    n->next=NULL;
    count++;
    if(head==NULL)
    {
        head=n;
        head->inbound=0;
    }
    else
    {
        struct node* temp=head;
        while(temp->next!=NULL)
        temp=temp->next;
        temp->next=n;
        (n->inbound)++;
    }
}

void find(int n)
{
    struct node* temp =head;
    int k=0;
    while(temp->next!=NULL && (count-k)!=n)
    {
        temp=temp->next;
        k++;
    }
    cout<<n<<"th element from the end of the list is "<<temp->key;
}
int main()
{
    create(1);
    create(2);
    create(3);
    create(4);
    create(5);
    int n;
    cin>>n;
    if(n<=count)
    find(n);
    else
    cout<<"Element to be found out of bounds";
    return 0;
}
