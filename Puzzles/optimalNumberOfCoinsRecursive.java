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
    
    List<int[]> coinsToPick = solve(coinLocations);
    
    System.out.println(coinsToPick.stream().map(coin -> "(" + coin[0] + ", " + coin[1] + "), ").collect(Collectors.joining()));
  }
  
  private static List<int[]> solve(List<int[]> coins) {
    
    List<List<int[]>> sols = new ArrayList<List<int[]>>();
    int current = 0;
    while (current < coins.size())
    {
      if (sols.isEmpty())
      {
        sols.add(new ArrayList<int[]>());
        List<int[]> a = new ArrayList<int[]>();
        a.add(coins.get(current));
        sols.add(a);
      }
      else
      {
        int elems = sols.size();
        for (int i = 0; i < elems; i++)
        {
          List<int[]> a = sols.get(i);
          sols.add(new ArrayList<int[]>(a));
        
          if (a.isEmpty() || a.get(a.size() -1)[0] < coins.get(current)[0] && a.get(a.size() -1)[1] < coins.get(current)[1])
          {
            a.add(coins.get(current));
          }
        }
      }
          
      current++;
    }
    
    int bestSol = -1;
    for (List<int[]> aSol : sols)
    {
      if (bestSol == -1 || sols.get(bestSol).size() < aSol.size())
      {
        bestSol = sols.indexOf(aSol);
      }
      
    }
    
    return sols.get(bestSol);
      
  }
}
