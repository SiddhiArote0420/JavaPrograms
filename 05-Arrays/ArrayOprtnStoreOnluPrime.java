/* Write a java program to take input array from user and perform operations in array. 
  Store only prime number at the same index of digit. 
   Input :-  5732  8659  2534  9625  7354  1325 
    Output :- 2573  5  253  25  357  235 */
	

/*import java.util.Scanner;

class ArrayOprtnStoreOnluPrime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length;i++)
		{
			int n = arr[i];
			
			while(n!=0){
				int a = n%10;
				
        
    }
}*/

import java.util.Scanner;

class ArrayOprtnStoreOnluPrime {

    // Function to check prime digit
    static boolean isPrime(int d) {
        if (d < 2)
            return false;

        for (int i = 2; i <= d / 2; i++) {
            if (d % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nOutput:");
        for (int i = 0; i < size; i++) {

            int num = arr[i];
            int result = 0;
            int place = 1;

            while (num != 0) {
                int digit = num % 10;

                if (isPrime(digit)) {
                    result = digit * place + result;
                    place = place * 10;
                }
                num = num / 10;
            }
            System.out.print(result + "  ");
        }

        sc.close();
    }
}