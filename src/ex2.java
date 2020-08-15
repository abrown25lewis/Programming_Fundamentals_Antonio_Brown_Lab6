
public class ex2 {

	public static int food (int N) {
		 int result = 0;
		 for (int i=0; i<N; i++)
		 result++;
		 for (int j=0; j<1000000; j++)
		 result+=j;

		 return result;
		
	}
	
	/* The time complexity for the above function "food" works in two parts for each loop. The top look which size is N and will be big-og(n) "O(n)" because we can call this liner due to i < N. 
	 * The second loop size is 1000000 and will be big-oh(1) "O(1)" because we can call this a constant because j = 10000000 or some number smaller.
	 * While N is less then 1000000 the top and bottom loop will perform in similar ways so the time complexity will depend on the second loop because it is the last one performed. 
	 * Once N is above the 1000000 the time complexity then falls only on the top loops because the second loop no longer processes and arithmetic within the loop.  
	 */
	

	public static void main(String[] args) {
		
		

	}

}
