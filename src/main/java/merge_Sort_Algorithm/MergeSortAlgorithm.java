package merge_Sort_Algorithm;

public class MergeSortAlgorithm {

	public static void main(String[] args) {
		
			int[]array = {3,5,2,8,9,6,1,7,4,10};
			mergeSort(array);		
			for(int i=0; i<array.length;i++) {
				System.out.println(array[i] + " ");
		}
	}
	
	private static void mergeSort(int[] array) {
		int length = array.length;
		if(length <= 1) return;
			int middle = length / 2 ;
			int[] leftArray = new int [middle];
			int[] rightArray = new int [length - middle];
	     
	     int i = 0;
	     int j = 0;
	     	for(i = 0; i< length ; i++) {
	     		if(i < middle) {
	    		leftArray[i] = array[i];
	    	}else {
	    		rightArray[j] = array[i]; 
	    		j++;
	     }
	     		
	}	     	
	     mergeSort(leftArray);
	     mergeSort(rightArray);
	     merge(leftArray,rightArray,array);
	}
	
	private static void merge(int[]leftArray,int[]rightArray,int[]array) {
		
		int leftsize = array.length /2;
		int rightsize = array.length - leftsize;
		int i=0,l=0,r=0;
		
	while(l<leftsize && r< rightsize) {
			if(leftArray[l] < rightArray[r]) {
				array[i] = leftArray[l];
				i++;
				l++;
			} else {
				   	array[i] =rightArray[r];
				   	i++;
				   	r++;
			}
		
		}
			while(l<leftsize) {
				array[i] = leftArray[l];
				i++;
				l++;
			} while(r<rightsize) {
					array[i] = rightArray[r];
						i++;
						r++;
			}
		
	}

}
