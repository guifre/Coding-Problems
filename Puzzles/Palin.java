public class Palin {
    private static final char[] toIgnore = {'.', ',', ' ', ':'};

    public static void main(String[] args) {
	System.out.println(Palin.isPal(args[0]));
    }

    public static boolean isPal(String s) {
	char[] in = s.toLowerCase().toCharArray();
	int j = in.length -1;
	for (int i = 0; i < in.length/2; i++) {
	    while (Palin.toIgnore(in[i])) {
		i++;
	    }
	    while (Palin.toIgnore(in[j])) {
		j--;
	    }
	    if (in[i] != in[j]) {
		return false;
	    }
	    j--;
	}
	return true;
     }
    
    public static boolean toIgnore(char in) {
	for (char s : Palin.toIgnore) {
	    if (s == in) return true;
	}
	return false;
    }
    
}