import java.util.*;
import java.util.concurrent.*;
public class Tree {
    private String data;
    private Tree leftN;
    private Tree rightN;
    
    public Tree(String data) {
	this.leftN = null;
	this.rightN = null;
	this.data = data;
    }
    public Tree() {
    
    }

    public Tree(String data, Tree leftN) {
	this.leftN = leftN;
	this.rightN = null;
	this.data = data;
    }

    public Tree(String data, Tree leftN, Tree rightN) {
	this.leftN = leftN;
	this.rightN = rightN;
	this.data = data;
    }
    
    public String getData() {
	return this.data;
    }
    public void setData(String data) {
	this.data = data;
    }
    public Tree getRightN() {
	return this.rightN;
    }

    public void setRightN(Tree rightN) {
	this.rightN = rightN;
    }

    public Tree getLeftN() {
	return this.leftN;
    }

    public void setLeftN(Tree leftN) {
	this.leftN = leftN;
    }

    public static void main(String[] args) {
	Tree tree = new Tree("7");
	Tree sample = tree.getSample();
	tree.print(sample);
	
	System.out.println("Max value of tree is ["+tree.getMaxValueOfUnbalanced(sample, 0)+"].");
	System.out.println("Sum value of tree is ["+tree.getSum(sample)+"].");
        int a = 23;
	System.out.println(a+" value exists in tree?["+tree.searchInt(sample, a)+"].");
	a =4;
        System.out.println(a+" value exists in tree?["+tree.searchInt(sample, a)+"].");
	System.out.println("inverting tree");
	Tree out = tree.mirrorTree(sample, null);
	tree.print(out);
	//Deque<Tree> t = tree.getAncestors(null, sample, sample.getLeftN().getLeftN());
	//System.out.println( sample.getLeftN().getLeftN() + " and " + sample.getLeftN().getRightN()+ "have common ancestor["+t.getFirst()+"].");
    }

    public void print(Tree tree) {
	System.out.println("BFS Traversal");
        tree.bfs(tree, true);
        System.out.println("END OF BFS Traversal\n");

	System.out.println("Preorder Traversal");
        tree.preOrder(tree);
        System.out.println("END OF Preorder Traversal\n");

        System.out.println("Postorder Traversal");
        tree.postOrder(tree);
        System.out.println("END OF Postorder Traversal\n");

        System.out.println("Inorder Traversal");
        tree.inOrder(tree);
        System.out.println("END OF Inorder Traversal\n");
	
	//tree.printBalanced(tree);
    }
    public void printBalanced(Tree tree) {
	ArrayList<String> data = new ArrayList<String>();
	this.toArray(tree, data);
	for (String s : data) {
	    System.out.println(data);
	}
    
    }
    public ArrayList<String> toArray(Tree tree, ArrayList<String> array) {
        if (tree == null)  {
	    return array;
	} else {
	    array.add(tree.getData());
	    array.add("sep");
	    array.addAll(this.toArray(tree.getLeftN(), array));
	    array.addAll(this.toArray(tree.getRightN(), array));
	    return array;
	}
    }
    /*start of algorithms to do things*/
    private Tree mirrorTree(Tree in, Tree out) {
	if (in != null) {
	    if (out != null) {
		out.setData(in.getData());
	    } else {
		out = new Tree(in.getData());
	    }
	}
	if (in.getLeftN() != null) {
	    out.setRightN(new Tree());
	    this.mirrorTree(in.getLeftN(), out.getRightN());
	}
	if (in.getRightN() != null) {
	    out.setLeftN(new Tree());
            this.mirrorTree(in.getRightN(), out.getLeftN());
        }
	return out;
    }
    private Tree lowestCommonAncestor(Tree tree, Tree node1, Tree node2, Deque<Tree> q) {
	if(q == null) {
	   q = new ArrayDeque<Tree>();
	}
	if(tree == null) {
	    return q.getFirst();
	}
	if(tree.equals(node1) || tree.equals(node2)) {
	    return q.getFirst();
	}
        if (this.contains(tree, node1) && this.contains(tree,node2)) {
	    q.addLast(tree);
	}
	this.lowestCommonAncestor(tree.getLeftN(), node1, node2, q);
        this.lowestCommonAncestor(tree.getRightN(), node1, node2, q);
	return q.getFirst();
    }

    private Deque<Tree> getAncestors(Deque<Tree> q, Tree tree, Tree node) {
	if (q == null) {
	    //q = new ConcurrentLinkedDeque<Tree>();
        }
        if (tree == null) {
	    //return new ConcurrentLinkedDeque<Tree>();
        } else if (tree.getData().equals(node.getData()) ) {
	    System.out.println("found node");
	    return q;
	} else {
	    q.add(tree);
	    System.out.println("queue size "+q.size());
	    q.addAll(this.getAncestors(q, tree.getLeftN(), node));
	    q.addAll(this.getAncestors(q, tree.getRightN(), node));
	    return q;
	}
	return null;
   }

    private boolean contains(Tree tree, Tree node) {
	if (tree == null) {
	    return false;
	} else if (tree.equals(node)) {
	    return true;
        } else {
	    return (this.contains(tree.getLeftN(), node) || this.contains(tree.getRightN(), node));
	}
    }



    private int getMaxValueOfUnbalanced(Tree t, int max) {
	if (t == null) {
	    return max;
	} else if (Integer.valueOf(t.getData()) > max) {
	    return this.max(this.getMaxValueOfUnbalanced(t.getLeftN(), Integer.valueOf(t.getData())), this.getMaxValueOfUnbalanced(t.getRightN(),  Integer.valueOf(t.getData())));
	} else {
	    return this.max(this.getMaxValueOfUnbalanced(t.getLeftN(), max), this.getMaxValueOfUnbalanced(t.getRightN(), max));
	}
    }
    
    private int getSum(Tree t) {
	if (t == null) {
	    return 0;
	} else {
	    return Integer.valueOf(t.getData()) + this.getSum(t.getLeftN()) + this.getSum(t.getRightN());
        }
    }

    private int max(int a, int b) {
	if(a > b) {
	    return a;
	} else {
	    return b;
	}
    }
    
    private boolean searchInt(Tree t, int data) {
	if (t == null ) {
	    return false;
	} else if (Integer.valueOf(t.getData()) == data) {
	    return true;
	} else {
	    return this.searchInt(t.getLeftN(), data)  || this.searchInt(t.getRightN(), data);
	}
    }
    /*end of algorithms to do things*/

    /*
     * Start of traversal algorithms
     */
    private void preOrder(Tree node) {
	if (node == null) {
	    return;
	}
	System.out.println(node.getData());
	this.preOrder(node.getLeftN());
	this.preOrder(node.getRightN());
    }
    
    private void bfs(Tree node, boolean first) {
	if (node == null) {
            return;
	}
	if (first) {
	    System.out.println(node.getData());
	}
	if (node.getLeftN() != null) {
	    System.out.println(node.getLeftN().getData());
	}
	if (node.getRightN() != null) {
            System.out.println(node.getRightN().getData());
	}
	this.bfs(node.getLeftN(), false);
	this.bfs(node.getRightN(), false);
    }
    private void postOrder(Tree node) {
	if (node == null) {
	    return;
	}
	this.postOrder(node.getLeftN());
	this.postOrder(node.getRightN());
	System.out.println(node.getData());
    }

    private void inOrder(Tree node) {
	if (node == null) {
	    return;
	}
	this.inOrder(node.getLeftN());
	System.out.println(node.getData());
	this.inOrder(node.getRightN());
    }
   
	
    /* end of traversal*/

    private Tree getSample() {
	Tree leftN4 = new Tree("7");
	Tree leftN3 = new Tree("6", leftN4, null);
	Tree rightN2 = new Tree("5");
	Tree leftN2 = new Tree("4", leftN3, null);
        Tree rightN = new Tree("3");
        Tree leftN = new Tree("2", leftN2, rightN2);
        Tree t = new Tree("1", leftN, rightN);
	return t;
    }


}