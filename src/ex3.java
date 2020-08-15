
public class ex3 {

	int bar(int N) {
		 int result = 1;
		 for (int i=1; i<N; i*=2)
		 result+=2;

		 return result;
		
	}
	
	/* The time complexity for the above function "bar works in one part. The loop which size is N and will be big-oh(n) "O(n)" because we can call this liner due to i < N. 
	 */
	

	public static void main(String[] args) {
		
		

	}
}
