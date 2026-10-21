//  Write a java program to check majority element of array.


import java.util.*;
public class Majority_Element{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {1,1,4,4,1,5,1};
		int max = 1, n = arr.length;
		int majorityElement = -1;
		for(int i=0 ; i<n; i++)
		{
			int count = 1;
			for(int j=i+1; j<n; j++)
			{
               if(arr[i] == arr[j])
			   {
                 count++;
               }
			}
             if(count > max){
                 max = count;
			     majorityElement = arr[i];
			 }
		}
		
		if(max > n/2)
		{
			System.out.println("Majority element is : "+majorityElement);
		}else{
			System.out.println("Majority element are not present ");
		}
	}
}	