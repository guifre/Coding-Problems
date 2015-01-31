import java.util.*;
class LongestConsPos {
    
    /* 
      Find the longest 
      subarray which consists of numbers that can be arranged in a continuous sequence. 
      For ex- {4,5,1,5,7,6,8,4,1} 
      output-5{5,7,6,8,4}.Find the longest.*/
    public static void main(String[] args) {
	int[] in = {3, 4, 1, 2, 3, 4, 6, 4};
	int[] out = getLongest(in, 4);
	for (Integer i : out) {
	    System.out.println(i + ", ");
	}
    }
    private static int[] getLongest(int[] in, int elems) {
	int mSum = 0, mStart =0, mEnd = 0, cSum=0;
	for (int i = 0; i <= in.length-elems; i++) {
	    for (int j = i; j < i+elems; j++) {
		cSum = cSum+in[j];
	    }
	    if (cSum > mSum) {
		mStart = i;
		mEnd = i+elems;
		mSum = cSum;
	   }
	    cSum = 0;
	}
	return Arrays.copyOfRange(in, mStart, mEnd);
    }



}