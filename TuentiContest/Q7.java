/*
 * http://contest.tuenti.net/Question_7.html
 */

public class Q7 {

    public int chpst(String orig, String fin, String[] costs, int tCost, int iter) {

        if (orig.equals(fin)) {
            return tCost;
        } else {
            if (orig.charAt(iter) != fin.charAt(iter)) {
                if (Integer.parseInt(costs[0]) + Integer.parseInt(costs[1]) < Integer.parseInt(costs[2])) {
                    tCost += Integer.parseInt(costs[0]) + Integer.parseInt(costs[1]);
                } else {
                    tCost += Integer.parseInt(costs[2]);
                }
                orig = orig.substring(0, iter) + fin.charAt(iter) + orig.substring(iter + 1);
            }
            return chpst(orig, fin, costs, tCost, iter+1);
        }
    }

    public static void main(String[] args) {

        //we parse the input
        String orig = args[0];
        String fin = args[1];
        String[] costs = args[2].split(",");

	//creates an instance of the class
	Q7 obj = new Q7();

        System.out.println(obj.chpst(orig, fin, costs, 0, 0));
    }
}
