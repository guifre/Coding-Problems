class RevWords {
    public static void main(String[] args) {
	System.out.println(args[0]);
	System.out.println(reverse(args[0]));
    }

    private static String reverse(String in) {
	if (!in.contains(" ")) {
	    return " " + in;
	} else {
	    String[] words = in.split(" ");
	    return " " + words[words.length-1] + reverse(in.substring(0, in.length() - words[words.length-1].length() -1 ));
        }
   }
}