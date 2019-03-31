/*Ayan Shymyrbay 201445540  exercise 1
 * In this task, the algorithm to find the maximum different of two subsets is implemented
 * 
 */

import java.util.Arrays;

public class maxDifference {
		public static void main(String[] args) {
			//Original array 
			int arr[] = {5,8,4,5};
			
			//For copying the content of arr[i] in order to pass it to second method
			int arrTemp[] = new int[arr.length];
			
			//Printing out the original array
			System.out.println("Original array:");
			for(int i = 0; i<arr.length; i++) {
				System.out.print(arr[i] + " ");
				arrTemp[i] = arr[i];
			}
			//Printing Maximum difference by invoking the methods
			System.out.println("\n\nMaximum Difference  between 2 subsets with complexity O(n^2):  " 
								+findMaxDifferenceNN(arr));
			System.out.println("\nMaximum Difference  between 2 subsets with complexity O(nlogn):  " 
								+findMaxDifferenceNlogN(arrTemp));
			
			
		}
		
		public static int findMaxDifferenceNN(int[] arr) {
			
			boolean anyDuplicate = false;
			boolean anyPositive = false;
			boolean anyNegative = false;
			int positiveSum = 0;
			int negativeSum = 0;
			int positiveMin = arr[0];
			int negativeMax = arr[0];
			int difference = 0;
			
			//two for loops to find if there are any Positive and Negative number in arr[i]
			for(int i = 0; i<(arr.length); i++) {
				
				anyDuplicate = false;
				
				if(!anyPositive) {
					if(arr[i]>=0) anyPositive = true;
				}
				
				if(!anyNegative) {
					if(arr[i]<0) anyNegative = true;
				}
				
				//To find if there is any duplicate
				for(int k = i+1; k<(arr.length); k++) {
					if(arr[i]==arr[k]) {
						arr[i] = arr[k] = 0; // if there is a duplicate, 
						anyDuplicate = true; //we put them it in different subsets
						break;				// so while finding difference they cancel each out
					}
				}
				
				//Summing all positive/negative numbers if there are ones
				if(!anyDuplicate) {
					if(arr[i]>=0) {
						if(arr[i]<positiveMin) {positiveMin = arr[i];}
						positiveSum += arr[i];
					}else {
						if(arr[i]>negativeMax) {negativeMax = arr[i];}
						negativeSum+= arr[i];
					}
				}
			}
			
			
				if(anyPositive && anyNegative) {
					difference = positiveSum - negativeSum;
				}else if(!anyPositive && anyNegative) {
					difference = 2*negativeMax - negativeSum; 
				}else if(anyPositive && !anyNegative)
					difference = positiveSum - 2*positiveMin; 
			
			
			return difference;
		}
		
		
		public static int findMaxDifferenceNlogN(int[] arr) {
			boolean anyDuplicate = false;
			boolean anyPositive = false;
			boolean anyNegative = false;
			int positiveSum = 0;
			int negativeSum = 0;
			int positiveMin = arr[0];
			int negativeMax = arr[0];
			int difference = 0;
			//First we sort them out
			Arrays.sort(arr);
			
			
			for(int i=0; i<(arr.length-1); i++) {
				//To find if there is any duplicate
				if(arr[i] != arr[i+1]) {
					
					//to find if there is any positive number
					if(!anyPositive) {if(arr[i]>=0) anyPositive = true;}
					//to find if there is any negative number
					if(!anyNegative) {if(arr[i]<0) anyNegative = true;}
					
					//to find if there minimum positive and maximum negative number 
					if(arr[i]>0) {if(arr[i]>positiveMin) {positiveMin = arr[i];}}
					else if(arr[i]<0){if(arr[i]>negativeMax) {negativeMax = arr[i];}}
					//since in this case no duplicates, 
					difference+=Math.abs(arr[i]); // a-(-b)=a+b  => a+Math.abs(b)
				}else {
					anyDuplicate = true;
					i++;
				}
			}
			//since we left the last element, we conduct checking for it separately
			if(arr[arr.length-2] != arr[arr.length -1]) {
				if(!anyPositive) {if(arr[arr.length-1]>=0) anyPositive = true;}
				if(!anyNegative) {if(arr[arr.length-1]<0) anyNegative = true;}
				if(arr[arr.length-1]>=0) {if(arr[arr.length-1]>positiveMin) {positiveMin = arr[arr.length-1];}
				}else {if(arr[arr.length-1]>negativeMax) {negativeMax = arr[arr.length-1];}}
				difference+=Math.abs(arr[arr.length-1]);
			}
			
			//if there are no duplicates
			if(!anyDuplicate) {
				//if there are only negative values
				if (!anyPositive) {												    
					difference += 2*negativeMax;
				//if there are only positive values
				} else if (!anyNegative) {						
					difference -= 2*positiveMin;
				}
			}
			
			return difference;
		}

}
