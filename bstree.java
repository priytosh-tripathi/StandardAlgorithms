import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data=data;
        left=null;
        right=null;
    }
}

class bstree
{

    public static void main(String args[])throws Exception
    {
      DataInputStream in = new DataInputStream(System.in);
        Node head = null;
        while(true)
        {
            System.out.println("Enter your BST Choice");
            System.out.println("1. Insert a new node");
            System.out.println("2. Print the Tree");
            System.out.println("3. Delete a Node");
            System.out.println("Any Other digit - Exit");
            int choice = Integer.parseInt(in.readLine());    
        if(choice == 1)
        {
          System.out.println("Enter the data");
          int dat = Integer.parseInt(in.readLine());
          head = insert(head,dat);
          continue;
        }
        else if(choice == 2)
        {
            print(head);
            System.out.println();
            continue;
        }
        else if(choice == 3)
        {
            //ob.delete();
            continue;
        }
        else{
            break;
        }
    }
    }

    static void print(Node head){
        if(head!=null)
        {
            print(head.left);
            System.out.print(head.data+" ");
            print(head.right);
        }
    }

    public static Node insert(Node head, int data) {
        if(head==null){
            return new Node(data);
        }
        else {
            Node cur;
            if(data <= head.data) {
                cur = insert(head.left,data);
                head.left = cur;
            } else {
                cur = insert(head.right,data);
                head.right = cur;
            }
            return head;
        }
    }
}