/**
 * Queue Class implementation
 * @author guifre
 *
 */
public class Queue {

	private final int SIZE = 200;
	private int[] qu;
	private int add;
	private int rem;

	
	/**
	 * Constructor of the class
	 * it initializes the attributes
	 */
	public Queue() {
		qu = new int[SIZE];
		add = 0; // next to add
		rem = 0; // next to remove
	}

	/**
	 * adds a vertex int the queue
	 * @param i vertex to add
	 */
	public void add(int i) {
		
		qu[add] = i;
		add++;
		if (add >= SIZE) { // end of array we go to the beginning
			add = 0;
		}

	}

	/**
	 * removes a vertex of the queue
	 * @return the removed vertex
	 */
	public int remove() {

		if (add != rem) { // queue empty
			int temp = rem;
			if (rem == SIZE) {
				rem = 0;
			}
			rem++;
			return qu[temp];
		} else {
			return -1;
		}

	}

	/**
	 * Displays the last item of the queue
	 * @return the last item of the queue
	 */
	public int peek() {
		return qu[rem];
	}

	/**
	 *  shows whether the queue is empty or not
	 * @return whether the queue is empty or not
	 */
	public boolean isEmpty() {
		return rem == add;
	}
}
