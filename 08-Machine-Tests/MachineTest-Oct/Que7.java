/* Store N integers in an ArrayList. Rotate the elements to the right by one position. 
 * Input: 5 10 20 30 40 50 
 * Output: Rotated List: 50 10 20 30 40 
 * Description: Store elements in ArrayList. 
 * Move last element to first position manually. 
 * Shift remaining elements one position forward. Do not use Collections.rotate(). */



package jullyTest;

import java.util.Scanner;
import java.util.*;
public class Que7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of arrayList");
		int size = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("Enter the values in arrayList");
		for(int i=0; i<size; i++) {
			list.add(sc.nextInt());		
		}
		
		int k=1;
		for(int i=0; i<k; i++) {
			int temp = list.get(list.size()-1);
			for(int j=list.size()-1; j>0; j++) {
				list.add(j,list.get(j-1)) ;
			}
			list.add(0, temp);
		}
          System.out.println(list);
	}

}
