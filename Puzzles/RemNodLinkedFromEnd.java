class RemNodLinkedFromEnd {
    public static void main(String[] args) {
	Node n = new Node(1, null);
	Node n2 = new Node (2, n);
	Node n3 = new Node(1, n2);
	Node n4 = new Node(3, n3);
	n = remove(n4, 2);
	while (n != null) {
	    System.out.println(n.data);
	    n = n.next;
	}
    }
    private static Node remove(Node n, int r) {
	Node runner = n;
	Node current = n;
	while (r > 0) {
	    runner = runner.next;
	    r--;
	}
	while (runner != null) {
	    runner = runner.next;
	    current = current.next;
	}
	current.data = current.next.data;
	current.next = current.next.next;
	return n;
    }
    static class Node {
	int data;
	Node next;
	public Node(int data, Node next) {
	    this.next = next;
	    this.data = data;
	}
    }
}