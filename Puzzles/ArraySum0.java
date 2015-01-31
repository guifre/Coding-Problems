public class ArraySum0 {
	public static void main(String[] args) {
		int[] data = {1,-3,2,-4,2,1,1,1-4,-5-3,1,3,4,5,6,3,-6,1,2,4,5,-9};
		int best=0;
		//i determines the length to be checked in the array
		for (int i = 0; i < data.length; i++) {
		    //this iterates over the array
		    for (int j = 0; j < data.length; j++) {
			int tmp = 0;
			while(j<i) {
			     tmp += data[j];
			     j++;
		        }
			if(tmp == 0) {
			    System.out.println("tmp is "+tmp+ " and j "+j);
			}
		    }
		}
	}


}
