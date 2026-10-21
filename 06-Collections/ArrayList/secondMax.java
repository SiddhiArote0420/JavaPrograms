//Second max ignore sing (-ve)

import java.util.*;

public class secondMax {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++){
			arr[i]= sc.nextInt();
		}
		
		int max = arr[0];
		int secMax = Integer.MIN_VALUE;
		
		for(int i=1; i<arr.length; i++){
			if(Math.abs(arr[i]) > Math.abs(max)){
				secMax= max;
				max = arr[i];
			}else if(Math.abs(arr[i]) > Math.abs(secMax) && Math.abs(arr[i]) < Math.abs(max))
			{
				secMax = arr[i];
			}
		}
		
		System.out.println("Max : "+max);
		System.out.println("Second Max : "+secMax);
	}
}
		