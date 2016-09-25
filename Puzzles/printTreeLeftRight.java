import java.io.*;
import java.util.*;

class Solution 
{
  public static void main(String[] args)
  {
    Node tree = new Node(new Node(null, null, 2), new Node(new Node(null, null, 4), null, 3), 1);
    
    printBalanced(tree);
  }
  
  private static void printBalanced(Node root)
  {
    Stack<Node> stack = new Stack<Node>();
    stack.push(root);
    System.out.println(root.data);
    while (!stack.isEmpty())
    {
      Node n = stack.pop();
      
      if (n.left != null)
      {
        System.out.print(n.left.data + "\n" );
        stack.push(n.left);
      }
      
      if (n.right != null)
      {
        System.out.print(n.right.data + "\n" );
        stack.push(n.right);
      }
    }
  }

  private static class Node
  {
    final Node left;
    final Node right;
    final int data;
      
    Node(Node left, Node right, int data)
    {
      this.left = left;
      this.right = right;
      this.data = data;
    }

  }
}