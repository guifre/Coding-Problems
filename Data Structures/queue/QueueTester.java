public class QueueTester {
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.add("test1");
                queue.add("test2");
                queue.add("test3");
		queue.get();
		queue.get();
		queue.get();
		queue.get();
	}
}
