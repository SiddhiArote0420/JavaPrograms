/* Write a java program to Remove all even numbers from an integer ArrayList.
Explanation:
 This teaches:
Removing elements using remove(index)
Handling shifting of elements after removal
Reverse loop concept
*/


import java.util.*;
public class RemoveEvenEle{
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
		
			for(int i = list.size() - 1; i >= 0; i--) {
            if(list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }

        System.out.println("After removing even numbers:");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
 }
}