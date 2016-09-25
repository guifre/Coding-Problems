import java.io.*;
import java.util.*;

/*

Given a random string S and another string T with unique elements, find the minimum consecutive sub-string of S such that it contains all the elements in T. 
example: 
S='adobecodebanc' 
T='abc' 
answer='banc'
 */

class Solution {
  public static void main(String[] args) {
      solve("abc", "adobecodebanc");
  }
  
  private static void solve(String target, String in)
  {
    String bestSoFar = null;
    int firstChar = -1;
    Set<Integer> foundChars = new HashSet<>();
    for (int i=0; i < in.length(); i++)
    {
      int index = target.indexOf(in.charAt(i));
      if (index != -1 && !foundChars.contains(index))
      {
        if (firstChar == -1)
        {
          firstChar = i;
        }
        foundChars.add(index);
      }
      if (foundChars.size() == target.length())
      {
        if (bestSoFar == null || bestSoFar.length() > in.substring(firstChar, i+1).length())
        {
          bestSoFar = in.substring(firstChar, i+1);
        }
        
        foundChars.clear();
        i = firstChar;
        firstChar = -1;
      }        
    }
    
    System.out.println(bestSoFar);
  }
}