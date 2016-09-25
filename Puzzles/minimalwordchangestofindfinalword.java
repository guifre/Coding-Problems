import java.io.*;
import java.util.*;

/*


facebook-interview-questions2
of 2 votes
17 
Answers
Given a dictionary containing a list of words, a starting word, and an ending word, return the minimum number of steps to transform the starting word into the ending word. 

A step involves changing one letter at a time to a valid word that is present in the dictionary. 

Return null if it is impossible to transform the starting word into the ending word using the dictionary. 

Example: 

Starting word: cat 
Ending word: dog 

cat -> cot -> cog -> dog ('cot' and 'cog' are in the dictionary) 

return 3


 */

class Solution {
  public static void main(String[] args) {
      // solve("cat", "dog", Arrays.asList("cog", "cot",  "cat",  "dog"));
      solve("abcd", "efgh", Arrays.asList("abch", "ebcd",  "efcd",  "efgd","efgh"));
  }
  
  private static void solve(String start, String target, List<String> dic) {
      List<String> visited = new ArrayList<>();
      List<String> currentPath = new ArrayList<>();
      currentPath.add(start);
      
      boolean noMorePaths = false;
      while(!noMorePaths)
      {
        noMorePaths = true;
      int oldSize;
      do
      {
        oldSize = currentPath.size();
        attempt(dic, visited, currentPath, target);
        if (oldSize < currentPath.size() && noMorePaths)
        {
          noMorePaths =false;
        }
      } while (oldSize < currentPath.size());
    
        if (distance(currentPath.get(currentPath.size() - 1), target) != 0)
        {
          visited.add(currentPath.remove(currentPath.size() - 1));
        }
        else
        {
          noMorePaths = true;
        }
      }
    for (String in : currentPath)
    {
      System.out.println(in);
    }
    
  }
  private static void attempt(List<String> dic, List<String> visited, List<String> currentPath, String target)
  {
      for (String word : dic)
      {
        String currentWord = currentPath.get(currentPath.size() - 1);
        if (!visited.contains(word) && distance(currentWord, word) == 1 && 
            distance(word, target) < distance(currentWord, target))
        {
          currentPath.add(word);
          currentWord = word;
          if (distance(currentWord, target) == 0)
         {
          System.out.println("solved");
           return;
         } 
        } 
        }
      }
  
  private static int distance(String in1, String in2) {
    int distance = in1.length();
    for (char c : in2.toCharArray())
    {
      if (in1.indexOf(c)!=-1)
      {
        distance--;
      }
    }
    
    return distance;
    }
}
