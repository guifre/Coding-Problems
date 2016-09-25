import java.io.*;
import java.util.*;

/*
 Write a class to take in a large arbitrary number, also provide a function to increment the number. The number will be passed on as an array of integers.
 */

class Solution {
  public static void main(String[] args) {
      new BigNumber(new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, 1234});
  }
  
  private static class BigNumber
  {
    int maxValues = 0;
    int currentValue;
    
    public BigNumber(int[] number)
    {
     increment(number);
    }
   
    public void increment(int[] number)
    {
      for (int n : number)
      {
        if ((long)currentValue + n > Integer.MAX_VALUE)
        {
          currentValue = ((int)((long)currentValue + n) - Integer.MAX_VALUE);
          maxValues++;
        }
      }
  }   
    
    public int[] get()
    {
      int[] value = new int[maxValues + 1];
      for (int i = 0; i < maxValues; i++)
      {
        value[i] = Integer.MAX_VALUE;
      }
      value[maxValues] = currentValue;
      
      return value;
    }
}
  
}