/*Given two arrays, our task is to find their common elements. 
 Input:  Array1 = [“a”, “b”, “c”, “d”, “e”, “f”],
            Array2 = [“b”, “d”, “e”, “h”, “g”, “c”]
Output: [b, c, d, e]
Your Task 
________________________________________________________
You have to create class names s FindCommonElements with following methods 
void setArray(int a[],int b[]); this function can accept two array as parameter 
Int [] getCommonElements(): you have to create a new third array and find the common element and
return it.
*/

import java.util.*;
class FindCommonElements{
	
	String a[];
	String b[];
	void setArray(String a[], String b[]){
	     this.a = a;
         this.b = b;
	}

    String [] getCommonElements(){
		
			
        int  cSize = 	a.length < b.length? a.length: b.length;
       	String c[] = new String[cSize];
		int k =0;

        for(int i=0; i<a.length ; i++)
		{
            for(int j=0 ; j < b.length; j++)
			{
                if( a[i].equals(b[j]))
				{
                    c[k++] = a[i];
                    break;					
				}
			}
		}
    
    String result[] = new String[k];
    for(int i=0; i<result.length; i++)
	{
        result[i] = c[i];
	}

    return	result;
	}
}

		
public class FindCommonEle{
 public static void main(String args[])
 {
    Scanner sc = new Scanner(System.in);

    // first input
    System.out.println("Enter the size of 1st array");
    int size1 = sc.nextInt();
	sc.nextLine();

    String a[] = new String[size1];

    System.out.println("Enter the vale in array");
	for(int i=0; i<a.length;i++){
          a[i] = sc.nextLine();
	}
	
	// second input
	System.out.println("Enter the size of 2st array");
    int size2 = sc.nextInt();
	sc.nextLine();
	
	String b[] = new String[size2];

    System.out.println("Enter the vale in array");
	for(int i=0; i<b.length;i++){
          b[i] = sc.nextLine();
	} 
	
	FindCommonElements e = new FindCommonElements();
	e.setArray(a, b);
	String [] result = e.getCommonElements();
	
	System.out.println("comman element is: ");
	for(int i=0; i<result.length; i++)
	{
        System.out.print(result[i]+" ");
	}

}
}
	
	