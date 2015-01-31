class PatternMatcher {
    /*
Pattern Matching 
---------------- 
Characters: a to z 
Operators: * + 
* -> matches zero or more (of the character that occurs previous to this operator) 
+ -> matches one or more (of the character that occurs previous to this operator) 

Output if a given pattern matches a string. 
Example: 
pattern:a*b 
string:aaab b, ab, aab, aaab, ab 
output:1 

pattern:a+aabc 
string:ab aabc, aaabc, aaaabc .. 
output:0 

pattern:aa*b*ab+ 
string:aab aab, aabab, aaaabbab 
output:1 

pattern: a+a*b* 
string: a ab, aab, aaabb 
output: 1 

Valid Assumptions: Please assume that both the pattern and string input are valid
     */

    public static void main(String[] args) {
	System.out.println(matches(args[0], args[1]));
    }
    public static boolean matches(String in, String pt) {
	int j = 0;
	int i = 0;
	while ( i < in.length() && j < pt.length()) {
	    if (j+1 < pt.length()) {
		
		if (pt.charAt(j+1) == '*') {//zero or more
		    while(i<in.length() && in.charAt(i) == pt.charAt(j)) {
			i++;
		    }
		    j=j+2;
		} else if (pt.charAt(j+1) == '+') {
		    if(in.charAt(i) != pt.charAt(j)) {
			return false;
		    }
		    while(i<in.length() && in.charAt(i) == pt.charAt(j)) {
			i++;
                    }
		    j=j+2;
		
		} else if (pt.charAt(j) == in.charAt(i)) {
		    i++;
		    j++;
		} else {
		    return false;
		}
		
	    } else if (pt.charAt(j) == in.charAt(i)) {
		i++;
		j++;
	    } else {
		return false;
	    }

	}
	if (j != pt.length()-1 || i != in.length()-1) {
	    return false;
	} else {
	    return true;
	}
    }
}
