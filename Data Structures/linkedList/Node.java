public class Node {
	private String data;
	private Node next;
	public Node(String data) {
		this.data = data;
		this.next = null;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Node() {
		this.next = null;
	}
	public void setNext(String data) {
		this.next = new Node(data);
	}
	public String getData() {
		return this.data;
	}
	public Node getNext() {
		return this.next;
	}
}
