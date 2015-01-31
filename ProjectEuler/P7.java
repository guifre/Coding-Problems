 /*
  * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
  * What is the 10 001st prime number?
  */

public class P7 {

   int MAX_VALUE = 10001;

   public int sol() {
        int prime = 2;
        int i = 2;
        int count = 0;

        while (count != MAX_VALUE) {
            while (prime % i != 0 && i < prime) {
                i++;
            }
            if (prime == i) {
                count++;
            }
           prime++;
            i = 2;
        }
        return prime-1;
    }

 public static void main(String[] args) {
	P7 obj = new P7();
        System.out.println("P7: " + obj.sol());
    }
}
