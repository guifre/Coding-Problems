import java.util.*;
class DupArrays {
	//Tell me all possible methods for removing duplicate elements from an array and sorted array....which one is the best according to you.
	public static void main(String[] args) {
		int[] in = {1, 2, 4, 4, 6, 7, 8, 21, 111, 1111};
		int[] in2 = remove(in);
		for (Integer i : in2) {
			System.out.print(i + ", ");
		}
		int[] in3 = removeOrdered(in);
                for (Integer i : in3) {
                        System.out.print(i + ", ");
                }


	}
	private static int[] remove(int[] in) {
		Set<Integer> trick = new LinkedHashSet<Integer>(); //guarantees order
		for(int i = 0; i <in.length; i++) {
			trick.add(in[i]);
		}
		int[] result = new int[trick.size()];
		Iterator<Integer> it = trick.iterator();
		for (int i = 0; i < trick.size(); i++) {
			result[i]=(int)it.next();
		}
		return result;
	}

	private static int[] removeOrdered(int[] in) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(in[0]);
		for (int i = 1; i< in.length; i++) {
			if (in[i-1] != in[i]) {
				l.add(in[i]);
			}
		}
		int[] a = (int[]) l.toArray();
		return a;
	}	
}
