package algorithms;

public class Main {

	public static void main(String[] args){
		int[] numbers = {10, 25, 433, 26, 73, 132, 5};
		int[]  sortedNumbers = {5, 9, 12, 10, 21, 26, 29,35, 39, 25, 49, 51, 58, 59, 61, 72, 88, 91, 94};
		
		// Call a linear search
		algorithms.LinearSearch.Search(numbers, 67);
		
		// Call the binary search
		algorithms.BinarySearch.Search(sortedNumbers, 59, 0, sortedNumbers.length);
	}

}
