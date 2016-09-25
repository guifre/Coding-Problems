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
    List<int[]> coinLocations = Arrays.asList(new int[]{0,1},new int[]{1,3},new int[]{1,2},new int[]{2,3},new int[]{4,7});
    
    List<int[]> coinsToPick = solve(coinLocations, 0, new ArrayList<int[]>());
    
    System.out.println(coinsToPick.stream().map(coin -> "(" + coin[0] + ", " + coin[1] + "), ").collect(Collectors.joining()));
  }
  
  private static List<int[]> solve(List<int[]> coins, int current, List<int[]> currentSol) {
    
    if (current >= coins.size())
    {
      return currentSol;
    }
      List<int[]> newSol = new ArrayList<>(currentSol);
    if (currentSol.isEmpty() || (currentSol.get(currentSol.size() -1)[0] < coins.get(current)[0] &&currentSol.get(currentSol.size() -1)[1] < coins.get(current)[1]))
    {
      newSol.add(coins.get(current));
    }
      List<int[]> pick = solve(coins, current+1, newSol);
    List<int[]> notPicked = solve(coins, current+1, new ArrayList<>(currentSol));
    
    if (pick.size() > notPicked.size())
    {
      return pick;
    }
    
    return notPicked;
  }
  
    private static void attempt(List<int[]> coins, List<int[]> currentSolution, List<int[]> visited, int[] elemNotToPick) {
      for (int[] coin : coins) {
        if (coin == elemNotToPick)
        {
          continue;
        }
        if (currentSolution.isEmpty()) {
          currentSolution.add(coin);
          continue;
        }
        int[] lastElement = currentSolution.get(currentSolution.size() -1);
        if (coin[0] > lastElement[0] && coin[1] > lastElement[1])
        {
          // System.out.println(coin[0] + " " + coin[1] + " | " + lastElement[0] + " " + lastElement[1]);
          currentSolution.add(coin);
        }
      }
    }
}
