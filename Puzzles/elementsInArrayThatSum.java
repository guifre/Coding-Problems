import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/*

 Question: Given a sequence of positive integers A and an integer T, return whether there is a sequence of A that sums up to exactly T 
Example 
[23, 5, 4, 7, 2, 11], 20. Return True because 7 + 2 + 11 = 20 
[1, 3, 5, 23, 2], 8. Return True because 3 + 5 = 8 
[1, 3, 5, 23, 2], 7 Return True because no sequence in this array adds up to 7
 */

class Solution {
  public static void main(String[] args) {
    assert true == solve(new int[]{23, 5, 4, 7, 2, 11}, 20, 0, 0);
    assert true == solve(new int[]{1, 3, 5, 23, 2}, 8, 0, 0);
    assert false == solve(new int[]{1, 3, 5, 23, 2}, 7, 0, 0);
  }
  
  private static boolean solve(int[] elems, int sum, int total, int index) {
    if (total == sum) {
      return true;
    } else if (total > sum || index == elems.length) {
      return false;
    } else {
      return solve(elems, sum, total + elems[index], index + 1) || solve(elems, sum, total, index + 1);
    }
  }
}
