/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */

import java.math.*;

public class P3 {

    long MAX_VALUE = 600851475143L;

    public long sol() {
        long j = MAX_VALUE / 2;
        while (MAX_VALUE % j != 0) {
            j--;
        }
        return j;
    }

    public static void main(String[] args) {
        P3 obj = new P3();
        System.out.println("P3: " + obj.sol());
    }
}
