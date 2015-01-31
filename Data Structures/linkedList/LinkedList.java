public class LinkedList {
	private String data;
	private Node root;
	public LinkedList() {
		this.root = new Node();
	}
	public Node getRoot() {
		return this.root;
	}
	public void setData(String obj) {
		this.root.setData(obj);
	}
}
