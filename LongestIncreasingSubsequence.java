package dynamicProgramming;

/**
The longest Increasing Subsequence (LIS) problem is to find the length of the longest subsequence of a 
given sequence such that all elements of the subsequence are sorted in increasing order. 
For example, length of LIS for { 10, 22, 9, 33, 21, 50, 41, 60, 80 } is 6 and LIS is {10, 22, 33, 50, 60, 80}.
 *
 */
public class LongestIncreasingSubsequence {

	public int lis(int[] arr) {
		int[] temp = new int[arr.length];
		
		for(int i = 0; i <arr.length; i++) {
			temp[i] = 1;
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < i; j++) {
				if((arr[i] > arr[j]) && (temp[i] < temp[j] + 1)) {
					temp[i] = temp[j] + 1;
				}
			}
		}
		int max = temp[0];
		for(int i = 1; i < arr.length; i++) {
			if(temp[i] > max) {
				max = temp[i];
			}
		}
		
		return max;
	}
}
