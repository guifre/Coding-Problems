import java.io.*;
import java.util.*;

/*
 * Flip a matrix 90 degrees on the right
 */

class Solution {
  public static void main(String[] args) {
   int[][] matrix = new int[][]{
     new int[] {1, 2, 3 ,4, 5},
     new int[] {6, 7, 8, 9, 10},
     new int[] {11, 12, 13, 14, 15},
     new int[] {16, 17, 18, 19, 20},
     new int[] {21, 22, 23, 24, 25}
   };
    
  int[][] flipped = solve(matrix);
  for (int i = 0; i < flipped.length; i++) {
    for (int j = 0; j < flipped[i].length; j++) {
      System.out.print(String.format("%02d ", flipped[i][j]));
    }
    System.out.println();
  }
  }
  
  private static int[][] solve(int[][] matrix) {
    int offset = 0;
    int[][] reversed = new int[matrix.length][matrix[0].length];
    while (offset < matrix.length) {
      for (int i = offset; i < matrix.length - offset; i++) {

        int last = reversed[0].length -1;
       
        // top to right
        reversed[i][last - offset] = matrix[offset][i];

        // left to top
        reversed[offset][i] = matrix[last - i][offset];

        // bottom to left
        reversed[i][offset] = matrix[last - offset][i];

        // right to bottom
        reversed[last - offset][last - i] = matrix[i][last - offset];
      }
      offset++;
    }
    return reversed;
  }
}
