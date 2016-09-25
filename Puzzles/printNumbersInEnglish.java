import java.io.*;
import java.util.*;

/*
    Convert a number to English representation. 
    100  -> one hundred
    110  -> one hundred and ten
    111  -> one hundred and eleven
    102  -> one hundred and two
    3564 -> three thousand five hundred and sixty four
    
 */

class Solution 
{
  private static final List<String> units = Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "therteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen");
  private static final List<String> dozens = Arrays.asList("twenty", "therty", "fourty", "fifty", "sixty");
  
  public static void main(String[] args) 
  {
      assert "one".equals(print(1));
      assert "ten".equals(print(10));
      assert "twentyone".equals(print(21));
      assert "one hundred and twentythree".equals(print(123));
      assert "number is too big".equals(print(1234));
  }
  
  private static String print(int number)
  {
    if (number < units.size())
    {
      return units.get(number);
    }
    else if (number < 100)
    {
      return dozens.get(number / 10 - 2) + print(number % 10);
    } 
    else if (number < 1000)
    {
      return units.get(number / 100) + " hundred and " + print(number % 100);
    } 
    else
    {
      return "number is too big";
    }
  }
}
