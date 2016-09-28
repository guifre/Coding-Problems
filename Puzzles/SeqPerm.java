import java.io.*;
import java.util.*;

/*
  permute a string
  
  123
  132
  213
  232
  312
  321
 */

class Solution {
  public static void main(String[] args) {
    permute("1234",  "");
  }

  private static void permute(String in, String prefix) {
    if (in.length() == 0) {
      System.out.println(prefix);
    } else {
      for (int i = 0; i < in.length(); i++) {
        permute(in.substring(0, i) + in.substring(i + 1, in.length()), prefix + in.charAt(i));
      }

    }

  }
}
