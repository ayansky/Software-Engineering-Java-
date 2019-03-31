/*Ayan Shymyrbay 201445540 lab 9 exercise 2
 * In this task, pigeonhole sorting was implemented to sort the given array
 */
public class pigeonHoleExe {

	 
		 public static void main(String[] args) {
		        //initializing an array
			 	int[] arrVal = {5, 3, 8, 5};
		        //printing original array
		        System.out.print("Original array:   ");
				for(int i = 0; i<arrVal.length; i++) {
					System.out.print(arrVal[i] + " ");
				}
				//passing the array to the method
				arrVal = pigeonSort(arrVal);
				//printing the sorted array
				System.out.print("\nSorted array:     ");
				for(int i = 0; i<arrVal.length; i++) {
					System.out.print(arrVal[i] + " ");
				}
				
				
		 }
		 
		 
		 public static int[] pigeonSort(int[] arr) {
			 int minimumVal = arr[0];
			 int maximumVal = arr[0];
			 int k = 0;
			 
			 //finding the minimum and maximum elements in the array
			 for(int i=0; i<arr.length; i++) {
				 if(arr[i]>maximumVal) maximumVal = arr[i];
				 if(arr[i]<minimumVal) minimumVal = arr[i];
			 }
			 
			 //identifying the range of pigeonhole array
			 int range = maximumVal - minimumVal + 1;
			 
			 //defining new array with range found earlier
			 int[] PigeonSorted = new int[range];
			 
			 //Count the frequency in which cell there is appropiate number
			 for(int i=0; i<arr.length; i++) {
				 PigeonSorted[arr[i] - minimumVal]++; 
			 }
			 
			 //
			 for(int i=0; i<range; i++) {
				 for(;PigeonSorted[i]>0;) {
					 arr[k] = i + minimumVal;
					 k++;
					 PigeonSorted[i]--;
				 }
			 }
			
			 return arr;
		 }

}
