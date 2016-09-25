import java.io.*;
import java.util.*;

/*
degenerate a tree: only right nodes

in: 
   1
  / \
 2  3
 
out:
  1
 / \
    3
     \
      2
 */

class Solution 
{
  
  public static void main(String[] args) 
  {
    Node n = degenerate(new Node(new Node(new Node(null, null, "baz"), null, "bar"), null, "foo"));
    
    System.out.println(n.right.right.data);
  }
  
  private static Node degenerate(Node root)
  {
    if (root.left != null)
    {
      Node nextRight = degenerate(root.left);
      root.left = null;
      while (root.right != null)
      {
        root = root.right;
      }
      
      root.right = nextRight;
    }
    
    return root;
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
