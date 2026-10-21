import java.util.*;

public class FirstNegativeInWindow11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();//5

        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();//1 -2 3 -4 -5
        }

        System.out.println("Enter window size k:");
        int k = sc.nextInt();//3

        int firstNegIndex = -1; // stores index of first negative number in current window

        // Slide the window
        for (int i = 0; i <= n - k; i++) {
            // If previous negative is out of window, reset it
            if (firstNegIndex < i)//-1<0 
			{
                firstNegIndex = -1;

                // find new first negative in current window
                for (int j = i; j < i + k; j++) //0+3
				{
                    if (arr[j] < 0) {
                        firstNegIndex = j;//1
                        break;
                    }
                }
            }

            // Print answer for this window
            if (firstNegIndex != -1) {
                System.out.print(arr[firstNegIndex] + " ");//-2
            } else {
                System.out.print("0 ");
            }
        }
    }
}
