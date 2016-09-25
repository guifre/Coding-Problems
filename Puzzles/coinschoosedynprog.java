import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/*
There are N coins with coordinates (x, y) where x >0 and y >0 
You start at (0, 0) and you can only do steps of form (dx, dy) where dx >0 and dy > 0 
Print the maximum number of coins that you can collect. 

Clarification: you can do as many moves as you wish, the point is to collect maximum number of coins. If you are located at position (a, b) you may jump to position (a+dx, b+dy) for all dx > 0 and dy > 0 

@krbchd: Your algorithm may output incorrect values. Suppose there are points (5, 7), (5, 8), (5, 9) for y coordinates LIS will output 7, 8, 9, however since these points are on the same x axis, you can choose only one of them.
 */

class Solution {
  public static void main(String[] args) {
    int[][] coins = new int[14][14];
    for (int i = 0; i < coins.length; i++) {
      for (int j = 0; j < coins[i].length; j++) {
        coins[i][j] = 0;
      }
    }
    coins[0][1] = 1;
    coins[1][4] = 1;
    coins[2][2] = 1;
    coins[3][3] = 1;
    coins[6][6] = 1;
    coins[8][8] = 1;
    
    int[][] sol = solve(coins);
     for (int i =  sol.length-1; i >=0; i--) {
      for (int j = 0; j < sol[i].length; j++) {
        System.out.print(sol[i][j] + " ");
      }
               System.out.print("\n");
    }
  }
  
  private static int[][] solve(int[][] coins) {

    int[][] sol = new int[coins.length][coins[0].length];
    sol[0][0] = coins[0][0];
    for (int j = 1; j < sol[0].length; j++) {
      if (coins[0][j] == 0) {
        sol[0][j] = sol[0][j-1];
      } else
      {
        sol[0][j] = sol[0][j-1]+1;
      }
    }
    
    for (int i = 1; i < sol.length; i++) {
      sol[i][0] = Math.max(sol[i-1][0], coins[i][0]); // first element done like this to about OutOfBounds
      for (int j = 1; j < sol[i].length; j++) {
        if (coins[i][j] == 0) {
          sol[i][j] = Math.max(sol[i - 1][j -1], sol[i][j-1]); //copy best resolt from previous row
        } else {
          sol[i][j] = Math.max(sol[i - 1][j - 1] + 1, sol[i][j - 1]); // best between current row and 1+prev row
        } 
      }
    }
    
    return sol;
  }
}
