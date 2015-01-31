class RemRep {
    /*
Find the first non-repeating character in a string:("ABCA" -> B )

     */
    public static void main(String[] args) {
	RemRep.remove(args[0]);
    }

    public static void remove(String in) {
	Set<Character> trick = new LinkedHashSet<Character>();
	for (Character c : in.toCharArray()) {
	    if (!trick.contains(c)) {
	    }
	}
    }
}