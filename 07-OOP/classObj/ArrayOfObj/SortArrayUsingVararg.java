/* WAP to create class name as Sort with two functions 
void setValue(int …x): this function can accept infinite value 
void sort(): this function can perform sorting on variable argument array
void display(): this function can display the data of array before sorting and after
sorting

*/

import java.util.*;
class Sort{
	int x[];
	
	void setValue(int ...x)
	{
		this.x = x;
	}
	
	void display(){
		System.out.println("Befor sorting: ");
	  for(int j = 0 ; j<x.length ; j++){
		  System.out.print(x[j]+" ");
	  }
	}
	
	void sort()
	{
      for(int i = 0; i<x.length-1 ; i++)
	  {
		for(int j = i+1; j<x.length ; j++) 
		{
			if(x[i] > x[j])
			{
				int temp = x[i];
				x[i] = x[j];
				x[j] = temp;
			}
		}
	  }
	  
	  System.out.println("Sorted array: ");
	  for(int j = 0 ; j<x.length ; j++){
		  System.out.print(x[j]+" ");
	  }
	}
}

public class SortArrayUsingVararg{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array ");
        int n = sc.nextInt();

        int[] data = new int[n];  

        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }

        Sort s = new Sort();
        s.setValue(data);
	    s.display();
        s.sort();
	}
}