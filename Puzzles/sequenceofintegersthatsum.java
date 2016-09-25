import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/*

 Question: Given a sequence of positive integers A and an integer T, return whether there is a continuous sequence of A that sums up to exactly T 
Example 
[23, 5, 4, 7, 2, 11], 20. Return True because 7 + 2 + 11 = 20 
[1, 3, 5, 23, 2], 8. Return True because 3 + 5 = 8 
[1, 3, 5, 23, 2], 7 Return False because no sequence in this array adds up to 7
 */

class Solution {
  public static void main(String[] args) {
    assert true == solve(new int[]{23, 5, 4, 7, 2, 11}, 20);
    assert true == solve(new int[]{1, 3, 5, 23, 2}, 8);
    assert false == solve(new int[]{1, 3, 5, 23, 2}, 7);
  }
  
  private static boolean solve(int[] elems, int sum) {
    for (int i = 0; i < elems.length; i++) {
        int currentSum = 0;
        int j = i;
        while (currentSum < sum && j < elems.length) {
          currentSum += elems[j++];
        }
        if (currentSum == sum) {
          return true;
        }
    }
    
    return false;
  }
}
