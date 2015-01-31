/**
 * Simple Stack implementation
 * @author guifre
 *
 */
public class Stack {

	private final int SIZE = 200;
	private int[] st;
	private int top;
	
	/**
	 * Contructor of the class
	 * It initilizes its attributes
	 */
	public Stack() {
		st = new int[SIZE];
		top = -1;
	}
	/**
	 * 
	 * @param i element to add in the stack
	 */
	public void push(int i) {
		top++;
		st[top] = i;
	}
	/**
	 * 
	 * @return the first item of the stack
	 */
	public int pop() {
		if (top > -1) {
			top--;
			return st[top+1];
		} else {
			return st[top];
		}
	}
	/**
	 * 
	 * @return the first element of the stack
	 */
	public int peek() {
		return st[top];
	}
	/**
	 * 
	 * @return whether the stack is empty or not
	 */
	public boolean isEmpty() {
		return top == -1;
	}
  }
