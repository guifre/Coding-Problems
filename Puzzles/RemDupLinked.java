class RemDupLinked {

    static class Node {
	protected int data;
	protected Node next;
	public Node (int data, Node next) {
	    this.data = data;
	    this.next = next;
	}
    }

    public static void main(String[] args) {
	Node n = new Node(2, null);
	Node n2 = new Node (3, n);
	Node n5 = new Node(2, n2);
	Node n3 = new Node(1, n5);
	Node n4 = new Node(2, n3);
	n4 = remDup(n4);
	while (n4 != null) {
	    System.out.println(n4.data);
	    n4 = n4.next;
	}

    }
    private static Node remDup(Node n) {
	int[] map = new int[255];
	Node tmp = n;
	map[tmp.data]=1;
	while (tmp.next != null) {
	    if (map[tmp.next.data] == 1) {
		tmp.next = tmp.next.next;
	    } else {
		map[tmp.data] = 1;
	    }
	    tmp = tmp.next;
	    if (tmp == null) {
		break;
	    }
	}
	return n;
    }







}