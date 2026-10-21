/*Store numbers in an ArrayList and count how many are even and how many are odd.
Explanation:
 This helps practice:
Modulus operator %
Condition-based counting
Iteration over collections
*/

import java.util.*;
public class CountEvenOdd{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        System.out.print("Enter number: ");
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            list.add(num);   // adding input to ArrayList
			
		}
		
		int size = list.size();
		int evenCount = 0;
		int oddCount = 0;
		for(int i=0; i<size; i++)
		{
			if(list.get(i) % 2 == 0)
			{
				evenCount++;
			}else{
				oddCount++;
			}
		}
		
		System.out.println("Even Numbers is: "+evenCount);
		System.out.println("Odd Numbers is: "+oddCount);
	}
}
	  