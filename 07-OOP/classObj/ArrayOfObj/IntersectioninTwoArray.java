/*Intersection of two Arrays
Given two arrays a[] and b[], the task is find intersection of the two arrays. Intersection of two arrays is
said to be elements that are common in both arrays. The intersection should not count duplicate
elements and the result should contain items in any order.
Input: a[] = {1, 2, 1, 3, 1},  b[] = {3, 1, 3, 4, 1}
Output: {1,  3}
Explanation: 1 and 3 are the only common elements and we need to print only one occurrence of
common elements
Input: a[] = {1, 1, 1},  b[] = {1, 1, 1, 1, 1}
Output: {1}
Explanation: 1 is the only common element present in both the arrays.
Input: a[] = {1, 2, 3},  b[] = {4, 5, 6}
Output: {}

Explanation: No common element in both the arrays.
Your Task is : Note you have to create class name as Intersection with two methods 
void setArray(int a[],int b[]): this function is used for accept two array as parameter 
Int [] getIntersection(): this function can find the intersection of array and return it.
*/

import java.util.*;
class Intersection{
	int a[];
	int b[];
	
	void setArray(int a[], int[]b)
	{
		this.a = a;
		this.b = b;
	}
	
	int [] getIntersection(){
		int cSize = a.length < b.length? a.length: b.length;
		int[] c = new int[cSize];
		int k = 0;
		
		for(int i=0; i<a.length;i++)
		{
			if(isPresent(b,a[i]) && !isPresent(c,a[i]))
			{
				c[k++] = a[i];
			}
		}
		
		
		
		int [] result = new int[k];
		for(int i=0; i<result.length; i++)
		{
			result[i] = c[i];
		}
		
		
		return result;
		
	
	}
	  boolean isPresent(int k[],int n)
		{
			for(int i=0; i<k.length; i++)
			{
				if(k[i] == n)
					return true;
			}
			return false;
		}
}

public class IntersectioninTwoArray{
 public static void main(String args[])
 {
    Scanner sc = new Scanner(System.in);

    // 1st input
    System.out.println("Enter the size of first array");
    int size1 = sc.nextInt();

    int arr1[] = new int[size1];

    System.out.println("Enter the vale in first array");
	for(int i=0; i<arr1.length;i++){
          arr1[i] = sc.nextInt();
	}
	
	//2nd input
	
    System.out.println("Enter the size of second array");
    int size2 = sc.nextInt();

    int arr2[] = new int[size2];

    System.out.println("Enter the vale in second array");
	for(int i=0; i<arr2.length;i++){
          arr2[i] = sc.nextInt();
	}
	
	Intersection in = new Intersection();
	in.setArray(arr1, arr2);
	int[] result = in.getIntersection();
	
	System.out.println("Intersection element");
	for(int i=0; i< result.length; i++)
	{
		System.out.print(result[i]+" ");
	}
    
	
 }
} 