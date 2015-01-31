public class LinkedListTester {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.setData("first");
		list.getRoot().setNext("second");
		list.getRoot().getNext().setNext("third");
	}
}
