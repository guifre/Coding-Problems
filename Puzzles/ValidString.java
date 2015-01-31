class ValidString {
    /*
     * Validate if a given string is numeric.
     * Some examples:
     * "0" => true
     * " 0.1 " => true
     * "abc" => false
     * "1 a" => false
     * "2e10" => true
     * Note: It is intended for the problem statement to be ambiguous. 
     * You should gather all requirements up front before implementing one.
     */
    public static void main(String[] args) {
	System.out.println(isValid(args[0]));
    }
    private static boolean isValid(String in) {
	boolean point = false;
	boolean e = false;
	int i = 0;
	if (in.substring(0,1).equals("-")){
		i++;
	    }
	try {
        while (i < in.length()) {
	    String current = in.substring(i, i+1);
	    if (current.equals("e")) {
		if (e) {
		    return false;
		} else {
		    e = true;
		    if (i+1 == in.length()) return false;
		}
	    } else if (current.equals(".")) {
		if (point) {
		    return false;
		} else {
		    point = true;
                    if (i+1 == in.length()) return false;
		}
	    } else if ( Integer.valueOf(current) >= 0 && Integer.valueOf(current)<= 9) { //its a number 
		} else {
		return false;
	    }
	    i++;   
	}
	} catch(NumberFormatException e22) {
	    return false;
	}
	return true;
    }






}