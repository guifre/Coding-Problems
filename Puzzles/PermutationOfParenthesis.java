import java.io.*;
import java.util.*;

/*
Given "n", generate all valid parenthesis strings of length "2n".

Example:
Given n=2

Output:
(())
()()

*/

class Solution {
  public static void main(String[] args) {
    solve(3, "");
  }

  private static void solve(int n, String current)
  {
    if (n == 0)
    {
      System.out.println(current);
      return;
    }
    if (current != "")
    {
      solve(n -1, current + "()");
    }
    solve(n -1, "(" + current + ")");
  }
}