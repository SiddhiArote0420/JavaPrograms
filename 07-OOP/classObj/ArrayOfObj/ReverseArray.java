/*Q12. WAP to create class name as Rev with two functions 
void setValue(int …x): this function can accept infinite values from calling 
void rev(): this function can reverse the array and display it
*/

import java.util.*;
class Rev {
    int[] arr;
    void setValue(int ...x)
	{
	    arr = x;
	}
	
	void rev(){
	
	    for(int i=0,j=arr.length-1; i < arr.length/2 ; i++,j--)
		{
		   int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;

        }

        System.out.println("Reverse Array: ");
        for(int i=0 ; i<arr.length ; i++)
        {
         System.out.print(arr[i]+" ");
        }		
    }
}

public class ReverseArray{
 public static void main(String args[])
 {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of array");
    int size = sc.nextInt();

    int arr[] = new int[size];

    System.out.println("Enter the vale in array");
	for(int i=0; i<arr.length;i++){
          arr[i] = sc.nextInt();
	}

    Rev r = new Rev();
    r.setValue(arr);
	r.rev();
 }
} 
	