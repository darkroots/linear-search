package algorithms;

public class LinearSearch {
	
	public static int Search(int[]numbers, int target) {
		int i;
		String errMsg = "No result found in the data set that match this value.";
		// iterate through number searching for target
		for(i = 0; i < numbers.length; i++){
			if(numbers[i] == target){
				System.out.println("Found a match at position " + numbers[i]);
				return i;
			}
			else if(numbers[i] != target){
				 System.out.println(errMsg);
				 return -1;
			}
		}
		return i;
	}
}
