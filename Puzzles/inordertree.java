import java.io.*;
import java.util.*;

/*
 ionorder
 */

class Solution 
{
  
  public static void main(String[] args) 
  {
    traverse(new Node(new Node(new Node(null, null, "baz"), null, "bar"), null, "foo"));
  }
  
  private static void traverse(Node root)
  {
    if (root != null)
    {
      traverse(root.left);
      System.out.print(root.data + " ");
      traverse(root.right);
    }
  }

  
  private static class Node
  {
     Node left;
     Node right;
    final String data;
    
    Node(Node l, Node r, String data)
    {
      left = l;
      right = r;
      this.data = data;
    }
  }
}
