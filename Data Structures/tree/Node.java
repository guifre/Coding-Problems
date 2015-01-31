public class Node<T> {
	private T data;
	private Node left;
	private Node right;
	public Node(Node left, Node right, T data) {
		this.left = left;
		this.right = right;
		this.data = data;
	}
	public Node() {
		this.right = null;
		this.left = null;
		this.data = null;
	}
	public Node(T data) {
		this.right = new Node();
		this.left = new Node();
		this.data = data;
	}
	public Node getRight() {
		return this.right;
	}
	public Node getLeft() {
		return this.left;
	}
	public T getData() {
		return this.data;
	}
	public void setData(T data){
		this.data = data;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	public static void main(String[] args) {
	Node n = new Node();
	n.setData(4);
	Node n2 = new Node();
	n2.setData(5);
	n.setLeft(n2);
	Node n3 = new Node();
	n3.setData(6);
	n.setRight(n3);
	System.out.println(n.isBST(n)+ " " + n.depth(n, 0));
	}
	public boolean isBST(Node root) {
		if(root == null) {
			return true;
		} else if (root.getLeft() != null
 			&& (int)root.getData() < (int)root.getLeft().getData()) {
			return false;
		} else if (root.getRight() != null
                        && (int)root.getData() > (int)root.getRight().getData()) {
                       	return false;
		} else {
			return this.isBST(root.getRight()) && this.isBST(root.getLeft());
		}
	}
	public int depth(Node root, int currentD) {
		if (root == null) {
			return currentD;
		} else {
			return Math.max(
			 depth(root.getLeft(), currentD+1),
			 depth(root.getRight(), currentD+1)
			); 
		}
	}
	
}
