public class Queue {
	private String[] queue;
	private final int MAX = 1000;
	private int start;
	private int end;
	public Queue() {
		this.queue = new String[MAX];
		this.start = 0;
		this.end = 0;
	}
	/*
	 *@return 0 if added, -1 oterwise
	*/
	public int add(String obj) {
		if (end == MAX) {
			System.out.println("Queue full");
			return -1;
		} else {
			System.out.println("added "+obj.toString());
			this.queue[end] = obj;
			end++;
			return 0;
		}
	}

	/**
	* @return null if empty, T otherwise
	*/
	public String get() {
		if (start == end ) {
			System.out.println("Queue empty");
			return null;
		} else {
			String obj = this.queue[start++];
			System.out.println("removed "+obj);
			return obj;
		}
	}
}
