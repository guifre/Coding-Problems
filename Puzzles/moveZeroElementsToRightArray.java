import java.io.*;
import java.util.*;

/*
 * Move zeros to left
 * {0, 2, 0, 3}
       |  |
 */

class Solution {
  public static void main(String[] args) {
   int[] in = new int []{0, 2, 0, 3};
    
   solve(in);
    
    for (int i : in) {
      System.out.println(i);
    }
  }
  
  private static void solve(int[] in) { 
    int rightIndex = in.length - 1;
    int leftIndex = 0;
    while (rightIndex >= in.length / 2) {
      if (in[rightIndex] == 0) {
        while (in[leftIndex] == 0)  {
          leftIndex++;
        }
        if (leftIndex >= in.length / 2) {
          return;
        }
        in[rightIndex] = in[leftIndex];
        in[leftIndex] = 0;
      }
      rightIndex--;
    }
  }
}
