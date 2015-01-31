public class BST {
	
	private Tree root;	
	public BST(Tree t) {
		this.root = t;
	}
	
	public Tree getRoot() {
		return this.root;
	}
	
	public void setRoot(Tree tree) {
		this.root = tree;
	}
	
	public void insert(int data) {
		while (Integer.valueOf(root.getData()) > data) {
			if(root.getLeftN() == null) {
				break;
			}
			root = root.getLeftN();
		}
		while (Integer.valueOf(root.getData()) < data) {
                	if(root.getRightN() == null) {
				break;
			}
		        root = root.getLeftN();
                }
		Tree t = new Tree(data);
	} 
}
