import java.util.*;
import java.io.*;

class Node{
  int data;
  Node left;
  Node right;
}

class BST{

  public Node createNode(int k){
    Node a = new Node();
    a.data = k;
    a.left = null;
    a.right = null;
    return a;
  }

  public Node insert(Node node, int k){
    if(node == null)
      return createNode(k);
    if(k < node.data)
      node.left = insert(node.left, k);
    else if(k > node.data)
      node.right = insert(node.right, k);

    return node;
  }
}

class BSTtest{
  public static void main(String args[]){
    BST a = new BST();
    Node root = null;
    Scanner in = new Scanner(System.in);
    while(in.hasNext()){
      int temp = in.nextInt();
      root = a.insert(root, temp);
      System.out.println("inserted successfully : " + temp);
    }
  }
}
