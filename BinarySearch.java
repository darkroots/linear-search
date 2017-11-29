package algorithms;

public class BinarySearch {
	
	public static int Search(int[] dataSet, int target, int start, int end){
		// binary search assumes a sorted array and can therefore continually split our search domain in half
		int middle = Math.floorDiv(start, end);
		int value = dataSet[middle];
		
		System.out.println(middle + " " + value);
		
		if(value > target){
			Search(dataSet, target, middle + 1, end);
		}
		else if(value < target){
			Search(dataSet, target, 0, middle -1);
		}
		return middle;
	}
	
}
