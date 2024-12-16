package maximum_SubArray_Sum;

public class MaximumSubArraySum {

	public static void main(String[] args) {		
		int [] m = {-1,2,-3,4,-5,6,3};
		int maxsum = maximumSubArraySum(m);
			System.out.println("Maximum subarray sum in an array of integers : " + maxsum);
			
		}
		
		public static int maximumSubArraySum(int[]m) {			
			int MaxSoFar = m[0];
			int MaxEndingHere = m[0];			
			 	for(int i=1;i<m.length;i++) {
			 		MaxEndingHere = Math.max(m[i], MaxEndingHere + m[i]);
			 		MaxSoFar = Math.max(MaxSoFar , MaxEndingHere);
			}
			 	
			 	return MaxSoFar;
			 	
		}

	}


