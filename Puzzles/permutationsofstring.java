import java.io.*;
import java.util.*;

/*

 print all permutations of characters of a string
 
 i.e. in: abc out abc, acb, bac, bca, cab, cba
 */

class Solution {
  public static void main(String[] args) {
    System.out.println("abcd");
    print("abcd", 0);
  }
  
 private static void print(String in, int index)
 { 
   if (index >= in.length())
   {
     return;
   }
    for (int i = index + 1; i < in.length(); i++)
    { 
     char[] foo = in.toCharArray();
     char tmp = foo[index];
     foo[index] = foo[i];
     foo[i] = tmp;
     String newFoo = new String(foo);
     System.out.println(newFoo);
     print(newFoo, index + 1);
   }     
   print(in, index+1);
 }
}
