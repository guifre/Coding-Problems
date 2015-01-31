/*
 * http://contest.tuenti.net/Question_6.html
 */

public class Q6 {

    //these constants contain the number of leds on for each number
    private final int zero = 6;
    private final int one = 2;
    private final int two = 5;
    private final int three = 5;
    private final int four = 4;
    private final int five = 5;
    private final int six = 6;
    private final int seven = 3;
    private final int eight = 7;
    private final int nine = 6;

    public static void main(String[] args) {

        //parse the input (time in seconds)
        int input = Integer.parseInt(args[0]);

        //count will contain the output
        int count = 0;

	//creates an instance of the class
	Q6 obj = new Q6();

        //each iteration calculates one second
        for (int i = 0; i <= input; i++)
            count += obj.toTime(i);

        //print out the result
        System.out.println(count);
    }

    //this method converts seconds to a real hour
    private int toTime(int i) {
        int count = 0;

        //hours units
        count += toLeds((i / 6000) % 10);
        //hours tens
        count += toLeds(((i / 6000) % 100) / 10);

        //minutes units
        count += toLeds((i / 60) % 10);
        //minutes tens
        count += toLeds(((i / 60) % 100) / 10);

        //seconds units
        count += toLeds((i % 60) % 10);
        //seconds tens
        count += toLeds(((i % 60) % 100) / 10);

        return count;
    }

    //this method returns the # of leds turned on for each digit (0-9)
    private int toLeds(int i) {

        if (i == 0)
            return zero;
        else if (i == 1)
            return one;
        else if (i == 2)
            return two;
        else if (i == 3)
            return three;
        else if (i == 4)
            return four;
        else if (i == 5)
            return five;
        else if (i == 6)
            return six;
        else if (i == 7)
            return seven;
        else if (i == 8)
            return eight;
        else
            return nine;
    }
}
