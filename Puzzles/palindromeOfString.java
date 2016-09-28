import java.io.*;
import java.util.*;

/*
We know a string is Palindrome if it is the same reading from both sides. Now we define the following string also Palindrome: 

A man, a plan, a canal, Panama! 

Write a code that returns if an string is palindrome and it should return true for above input. (Without directly saying, I should conclude that I have to only consider alphanumerical characters in a string). In addition, we assume the string is very long and we can not keep a copy of this string or even a copy of preprocessed version of this string. Therefore the result should be returned with the first sweep of the string.
 */

class Solution {
  public static void main(String[] args) {
    assert true == solve("A man, a plan, a canal, Panama! ");
    assert false == solve("A man, a plfooan, a canal, Panama! ");
  }
  
  private static boolean solve(String in) {
    int left = 0,  right = in.length() - 1;
    while (left < right ) {
      while (!Character.isLetterOrDigit(in.charAt(left))) {
        left++;
      } 
      while (!Character.isLetterOrDigit(in.charAt(right))) {
        right--;
      }
      if (charactersDiffer(left, right, in)) {
        return false;
      }
      right--;
      left++;
    }
    
    return true;
  }
  
  private static boolean charactersDiffer(int pos1, int pos2, String in) {
    return !lowerCaseCharAt(pos1, in).equals(lowerCaseCharAt(pos2, in));
  }
  
  private static String lowerCaseCharAt(int pos, String in) {
    return in.substring(pos, pos + 1).toLowerCase();
  }
}