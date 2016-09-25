import java.io.*;
import java.util.*;

/*

Given the root of a binary tree containing integers, print the columns of the tree in order with the nodes in each column printed top-to-bottom.

     1
    / \
   2   4
  /
3

out : 3, 2, 1, 4
 */

class Solution {
  public static void main(String[] args) {
    compare(new Node(new Node(new Node(null, null, "3"), null, "2"), new Node(null, null, "4"), "1")); 
  }
  
  private static void compare(Node root)
  {   
    final List<NodeInColumn> nodesWithColumn = new ArrayList<>();
    
    fillList(root, nodesWithColumn, 0);
    
    Collections.sort(nodesWithColumn, new NodeComparator());
    
    for (NodeInColumn node : nodesWithColumn)
    {
      System.out.print(String.format("%s ", node.node.data));
    }
  }
  
  private static void fillList(Node node, List<NodeInColumn> nodes, int current)
  {
    if (node == null)
    {
      return;
    }
    
    nodes.add(new NodeInColumn(current, node));
    fillList(node.left, nodes, current - 1);
    fillList(node.right, nodes, current + 1);
  }
  
  private static class Node
  {
    final Node left;
    final Node right;
    final String data;
    
    public Node(Node left, Node right, String data)
    {
      this.left = left;
      this.right = right;
      this.data = data;
    }
  }
  
  private static class NodeInColumn
  {
    final int column;
    final Node node;
    
    public NodeInColumn(int column, Node node)
    {
      this.node = node;
      this.column = column;
    }
  }
  
  private static class NodeComparator implements Comparator<NodeInColumn>
  {
    public int compare(NodeInColumn n1, NodeInColumn n2)
    {
      if (n1.column > n2.column)
      {
        return 1;
      }
      else if (n1.column < n2.column)
      {
        return -1;
      }
      
      return 0;
    }
  }
}
