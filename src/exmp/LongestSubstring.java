package exmp;

public class LongestSubstring {

	
	
	  public static void main(String[] args) {
		  int arr[]= {2, 3, 4, 9, 5, 1, 7, 8,6}; 
		  int k=3; 
		  int length = arr.length;
	  
	  findMaxSum(arr, k, length); }
	  
	  
	  public static void findMaxSum(int arr[], int k, int length) { 
		  int sum=0; 
		  int result=0;
		  for(int i=0; i<k ; i++) { 
			  sum += arr[i]; //System.out.println(sum);
	  } 
		  int latestSum = sum; 
		  for(int j=k; j<length; j++) {
			  latestSum += arr[j] - arr[j-k];
			  	result = Math.max(latestSum, sum);
	  
	  } System.out.println(result);
	  
	  
	  
	  }
	 
	
	//Output: 21	
	

		
	
	
	
	//Given a string, find the length of the longest substring in it with no more 
	//than K distinct characters.

	
	/*
	 * public static boolean isDistinct(String s, int i, int j){
	 * 
	 * boolean isExist = false; for(int k=i; k<j ; k++) {
	 * 
	 * 
	 * } //if(s.charAt(i)-)
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * public static void getDistinctSubString(String s) {
	 * 
	 * int length = s.length();
	 * 
	 * 
	 * for(int i=0; i<length;i++) { for(int j=0; j<length;j++) { isDistinct(s, i,j);
	 * } }
	 * 
	 * }
	 * 
	 * public static void main(String[] args) { String s ="ayaraacccixy"; //aaccc
	 * getDistinctSubString(s);
	 * 
	 * 
	 * }
	 */
	 }



