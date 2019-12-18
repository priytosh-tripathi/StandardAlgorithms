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
void display()
{
    struct node* temp=head;
    int c=count;
    while(temp->next!=NULL&&--c)
    {
        //cout<<temp->key;
        temp=temp->next;
    }
    //cout<<temp->key;
}
void loop(int data,int pos)
{
    struct node* n =(struct node*)(malloc(sizeof(struct node)));
    n->key=data;
    pos--;
    count++;
    struct node* temp=head;
     while(temp->next!=NULL)
        temp=temp->next;
        temp->next=n;
        (n->inbound)++;
        temp=head;
    while(pos--&&temp!=NULL)
    temp=temp->next;
    n->next=temp;
    (temp->inbound)++;
    
}
void check_loop()
{
    struct node* temp=head;
    int c=count;
    int k=1;
    while(temp->next!=NULL&&--c)
    {
        //cout<<temp->key<<" ";
        
        if(temp->inbound>1)
        {
            cout<<endl<<"Loop exists at "<<k<<"nd node";
            break;
        }
        temp=temp->next;
        k++;
    }
    //cout<<c<<" "<<k<<" "<<count;
    if(c==1&&k==count)
    cout<<"Loop doesn't exist";
    
}
int main()
{
    create(1);
    create(2);
    create(3);
    loop(4,2);//If you want a loop, enter the position to which the current node needs to be pointing to
    display();
    check_loop();
    //cout<<"Hello World";

    return 0;
}
