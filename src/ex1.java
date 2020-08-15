import java.util.Scanner;

public class ex1 {

	// creating the single input parameter for the smallest time complexity for cubinc n
	public static int cubic(int n)

	{

		int nsum = 0;

		
		
		// creating a method that is efficient to making a cubic formula
		for (int x = -1; x < n; x++)

		{

			for (int y = 0; y < n+1; y++)

			{

				for (int z = 0; z < n+1; z++)

				{

					nsum = x;

				}
			}
		}

		return nsum;

	}

	public static void main(String[] args) {
		
		Scanner nscan = new Scanner(System.in);

		System.out.print("Please enter an integer :");

		int n = nscan.nextInt();
		
		// This will take the result of n and cube
		System.out.print("The cube of the integer is :" + cubic(n));
		
		nscan.close();
	}

}



