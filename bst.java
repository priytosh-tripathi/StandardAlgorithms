import java.util.*;
public class bst
{
    static class Node{
        int data;
        Node left;
        Node right;
        Node (int d){
            data = d;
            left=null;
            right=null;
        }
    }
    Node root = null; Node temp = null; Node temp2 = null;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        bst tree = new bst();
        System.out.println("Enter Number of elements");
        int s = sc.nextInt();
        System.out.println("Enter elements");
        while(s-->0?true:false)
        {
            int dat = sc.nextInt();
            if(tree.root==null)
            {
                tree.temp = new Node(dat);
                tree.root=tree.temp;
            }
            else{
                tree.temp2=new Node(dat);
                if((tree.temp.data<dat)||(tree.temp.data==dat))
                   tree.temp.right=tree.temp2;
                else
                    tree.temp.left=tree.temp2;
            }
        }
    }
}