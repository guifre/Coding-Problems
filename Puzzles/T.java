/*Input:
      A
     / \
    B   C
   /   / \
  D   E   F
 /     \
G       H


Output:
A
BC
DEF
GH*/
import java.util.*;
class T {
    static class Node {
        String data;
        Node left;
        Node right;
    }
    public static void main(String[] args) {
        Node n = new Node();
	n.data ="";
	Node n2 = new Node();
	n2.data="test";
	n2.left=n;
	Node n3 = new Node();
	n3.data ="sagr";
	n3.left = n2;
        printByLevel(n3);
    }
    private static void printByLevel(Node root) {
        Queue<Node> q = new ArrayDeque<Node>();
        q.add(root);
        int count = 0;
        Node missingNodes = new Node();
        missingNodes.data = "somethingthatcannotcomeasinput";
        while (!q.isEmpty()) {
            Node tmp = q.remove();
            if(tmp == missingNodes) {
                q.add(missingNodes);
                q.add(missingNodes);
            }
            if (tmp.left != null) {
                q.add(tmp.left);
            } else {
                q.add(missingNodes);
            }
            if (tmp.right != null) {
                q.add(tmp.right);
            } else {
                q.add(missingNodes);
            }
            if(tmp != missingNodes) {
              System.out.print(tmp.data);
           }
           if (Math.log(count)%2 == 0) {
               System.out.println();
           }
           count++;
        }
    }   
}





