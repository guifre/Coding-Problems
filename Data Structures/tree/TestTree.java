public class TestTree {
	public static void main(String[] args) {
		System.out.println("I am a Tree testeer");
		Tree t = new Tree("rootData");
		System.out.println("Created tree with data "+t.getRoot().getData());
		t.getRoot().setLeft(new Node(null,null,"left data"));
		System.out.println("Created node in left with data "+t.getRoot().getLeft().getData());
		t.getRoot().setRight(new Node("secondlevel right data"));
		System.out.println("Created node in right with data "+t.getRoot().getLeft().getData());
		t.getRoot().getLeft().setLeft(new Node(null, null, "third level data left"));
		System.out.println("Created node in left with data "+t.getRoot().getLeft().getLeft().getData());
		TraversalHelper trav = new TraversalHelper();
		trav.inorder(t.getRoot());
	}


}
