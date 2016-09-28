import java.io.*;
import java.util.*;

/*
Given a random string S and another string T with unique elements,
find the minimum consecutive sub-string of S such that it contains all
the elements in T.
example:
S='adobecodebanc'
S='abxcxxxxabc'
   |  |
   
   a -> 0
   b -> 3
   c - >5 
   a - > 8
   b - > 9
   c - > 10
   
   
   b 9?
T='abc'
answer='banc'


 */

class Solution {
  public static void main(String[] args) {
        System.out.println(("adobecodebanc".substring(0, 1)));

    System.out.println(solve("adobecodebanc", "abc"));
  }
  
  private static String solve(String in, String chars) {
    String currentSol = "";
    int bestStart = -1, bestEnd = -1;
    int start =-1;
    for (int i = 0; i < in.length(); i++) {
       String current = in.substring(i, i + 1);
       if (chars.contains(current) && !currentSol.contains(current)) {
         if (start == -1)  {
           start = i;
         }
         currentSol += current;
         if (currentSol.length() == chars.length() && bestEnd - bestStart > start -i) {
            bestStart = start;
            bestEnd = i +1;
         }   
      }
      
      if (bestStart != -1) {
        start++;
        currentSol = currentSol.replaceFirst(in.substring(start, start + 1), "");
        if (currentSol.length() == chars.length()) {
          bestStart = start+ 1;
          bestEnd = i;
        }
      }
    }

   return in.substring(bestStart, bestEnd + 1);
  }
}