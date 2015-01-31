public class GetCodes {
    static String alphabet="#abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
	getCodes("", args[0]);
    }
    private static void getCodes(String prefix, String in) {
	int N = in.length();
	if (N == 0) {
	    System.out.println(prefix);
	} else { 
	    getCodes(prefix+alphabet.charAt(Integer.valueOf(in.substring(0,1))), in.substring(0, N-1));
	    if(N >1) getCodes(prefix+alphabet.charAt(Integer.valueOf(in.substring(0,2))),in.substring(0,N-2));
	}
    }
}