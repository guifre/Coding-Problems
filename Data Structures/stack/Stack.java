public class Stack {
	private String[] stack;
	private final int MAX = 1000;
	private int start;
	public Stack() {
		this.stack = new String[MAX];
		this.start = 0;
	}
	public String pull() {
		if (start == 0) {
			System.out.println("stack empty");
			return null;
		} else {
			start--;
			String elem = this.stack[start];
			System.out.println("removed "+elem.toString());
			return elem;
		}
	}
	public void push(String elem) {
		if (start == MAX) {
			System.out.println("stack full");
		} else {
			System.out.println("added "+elem.toString());
			this.stack[start] = elem;
			start++;
		}
	}
}

