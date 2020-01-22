/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;
struct node* head=NULL;
struct node
{
    int data;
    struct node* prev,*next;
};
struct node* create_node(int key)
{
    struct node* n=new(struct node);
    if(head==NULL)
    {
        head=n;
        n->data=key;
        n->prev=n->next=NULL;
        return n;
    }
    struct node* temp=head;
    while(temp->next!=NULL)
    temp=temp->next;
    temp->next=n;
    n->prev=temp;
    n->next=NULL;
    n->data=key;
}
void display()
{
    struct node* temp=head;
    while(temp->next!=NULL)
    {
        cout<<temp->data<<" ";
        temp=temp->next;
    }
    cout<<temp->data;
}
void reverse()
{
    struct node*temp=head,*temp1 =head;
    while(temp->next!=NULL)
    temp=temp->next;
    //struct node* temp1=temp;
    while(temp1!=NULL)
    {
        //struct node* temp2=temp;
        if(temp->next==NULL)
        head=temp;
        temp->next=temp->prev;
        temp->prev=temp1->next;
        temp=temp->next;
        temp1=temp;
    }
    
}
int main()
{
    struct node* first_node=create_node(1000);
    create_node(2000);
    create_node(3000);
    //display();
    reverse();
    display();
    //cout<<"Hello World";

    return 0;
}
