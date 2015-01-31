import java.util.*;
class Deps {
    public static void main(String[] args) {
	Vector<LinkedList<Integer>> deps = new Vector<LinkedList<Integer>>();
	LinkedList<Integer> list0 = new LinkedList<Integer>();
	list0.add(1);
	deps.add(list0);

	LinkedList<Integer> list1 = new LinkedList<Integer>();
        list1.add(2);
        deps.add(list1);
	LinkedList<Integer> list2 = new LinkedList<Integer>();
        list2.add(3);
        deps.add(list2);
	LinkedList<Integer> list3 = new LinkedList<Integer>();
        deps.add(list3);

	List<Integer> list = Deps.solve(deps,0);
	for(Integer in : list) {
	    System.out.println(in);
	}
    }
    private static List<Integer> solve(Vector<LinkedList<Integer>> deps, int i) {
	List<Integer> de = new ArrayList<Integer>();
	    if (!deps.get(i).isEmpty()) {
		de.addAll(solve(deps, i+1));  
	    }
	    de.add(i);
	    return de;
    }

}