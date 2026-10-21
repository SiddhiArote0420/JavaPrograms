/* Write a java program to Check whether a given number exists in an ArrayList.
Explanation:
 You learn:
Linear search logic
Use of flag variable
Comparison using loop
*/

import java.util.*;
public class SearchElement{
 public static void main(String x[])
 { 
    Scanner sc = new Scanner(System.in);
	
	ArrayList<Integer> list = new ArrayList<>();
	
	System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        System.out.print("Enter number: ");
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
			list.add(num);
		}
		
		System.out.println("Enter the Search element");
		int serchEle = sc.nextInt();
		
		boolean flag = false ;
		for(int i = 0; i < n; i++) {
			for(int j=0; j< n; j++)
			{
				if(list.get(i) == list.get(j))
				{
					flag = true;
					break;
				}else{
					flag = false;
				}
			}
		}
		
		if(flag)
		{
			System.out.println("This number is exite in ArrayList");
		}else{
			System.out.println("This number is not exite in ArrayList");
		}
 }
}
 