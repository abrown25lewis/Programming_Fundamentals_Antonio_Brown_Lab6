import java.util.Arrays;



/*
 * For the below I am going to trace the left and right bounds and middle
 * int[] nums = {1, 14, 15, 24, 55, 59, 73, 90, 94, 99};
	int target = 73;
	
	First Iteration
	
	Right = index 9(99), Left= index 0(1),  Middle = index 4?(55) 
	
	Then on then after the middle is established the the index will go on to be trimmed at the middle to the left. 
	
	New Array = {59,73,90,94,99};
	
	Second Iteration
	
	Right = index 9(99), Left= index 5(59),  Middle = index 7(90) 
	 
	Then on then after the middle is established the the index will go on to be trimmed at the middle to the right.
	
	New Array = {59,73};
	
	Third Iteration
	
	Right = index 6(73), Left= index 5(59),  Middle = index 5(59) 
	 
	Then on then after the middle is established the the index will go on to be trimmed at the middle.
	
	New Array = {59,73};
	
	Fourth Iteration
	
	Right = index 6(73), Left= index 6(73),  Middle = index 6(73) 
	 
	Then on then after the middle as 73 the array spot is determined at index spot 6
	
	
 */











// This example shows implementations of linear
// and binary search algorithms (recursive and iterative versions)
public class ex4search {

	public static void main(String args[]) {
		int[] nums = {1, 14, 15, 24, 55, 59, 73, 90, 94, 99};
		int target = 73;
		

		Arrays.sort(nums);  // Need to sort before using binary search
		System.out.println(target+" is at index "+binarySearch(nums,target));
		System.out.println(target+" is at index "+binarySearchR(nums,target,0,nums.length-1));
		
	}
	


	// Iterative implementation of binary search
	public static int binarySearch(int[] a, int t) {
		int l = 0;
		int r = a.length-1;
		int m;
		
		while (l<=r) {
			m = (l+r)/2;
			if (t==a[m]) return m;
			else if (t<a[m]) r = m - 1;
			else l = m + 1;					
		}
		
		return -1;
	}
	
	// Recursive implementation of binary search
	public static int binarySearchR(int[] a, int t, int l, int r) {
		// Test for base case
		if (l>r) return -1;
		
		int m = (l+r)/2;
		if (t==a[m]) return m;
		
		// Recursive cases
		else if (t<a[m]) return binarySearchR(a, t, l, m - 1);
		else return binarySearchR(a, t, m + 1, r);							
	}

}
