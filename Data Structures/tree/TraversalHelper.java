public class TraversalHelper {
	
	public void inorder(Node n) {
		if (n != null) {
			inorder(n.getLeft());
			System.out.println(n.getData()); 
			inorder(n.getRight());
		} else {
			return;
		}
	}
}
