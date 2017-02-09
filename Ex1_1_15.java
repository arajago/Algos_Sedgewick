/*
Write a static method histogram() that takes an array a[] of int values and 
an integer M as arguments and returns an array of length M whose ith entry is the num-
ber of times the integer i appeared in the argument array. If the values in a[] are all 
between 0 and M–1, the sum of the values in the returned array should be equal to 
a.length.
*/

public class Ex1_1_15{
	public static void main(String[] args){
		int[] input = new int[]{0, 2, 0, 0, 0, 1, 1, 1, 2, 3, 4, 3, 4};
		int[] output = histogram(input, 6);
		printArray(output);
	}	
	
	public static void printArray(int[] input){
		for(int i=0; i<input.length; i++){
			System.out.print(input[i]+" ");
		}
	}
	
	public static int[] histogram(int[] inputArr, int mLen){
		int output[] = new int[mLen];
		for(int i=0; i<inputArr.length; i++){
			int valInItertor = inputArr[i];
			if(valInItertor < mLen){
				output[valInItertor] = output[valInItertor] + 1; 
			}
		}
		return output;
		//return an arrray of length mLen
	}
}