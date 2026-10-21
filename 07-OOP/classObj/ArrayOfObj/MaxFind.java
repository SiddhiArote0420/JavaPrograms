/* WAP to create class name as FindMax with two functions 
void setValue(int …x): this function accept infinite parameter from calling
int  getMax(): this function can find the value from the function and return it.
*/

import java.util.*;
class FindMax{
   int[] x;
   void setValue(int ...x)
   { 
     this.x = x;   
   }
    int getMax(){
        int max = Integer.MIN_VALUE;
	   for(int i : x)
	   {
		 if(max < i)
		 {
            max = i;
		 }
	   }
     return max;
	}	 

}
public class MaxFind{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		FindMax m = new FindMax();
		m.setValue(20,34,54,27,86);
		int result = m.getMax();
		System.out.println("Max is: "+result);
	}
}
		 