//Write a java program to find the frequency of digit in a given integer

import java.util.*;
public class FrequencyCount {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number");
        int n = sc.nextInt();
        
        int temp = n, i = 0;  
        boolean flag;

        while(temp != 0) {
            int a = temp % 10;  // current digit
            temp = temp / 10;

            int check = i;   
            flag = true;

            // check if digit 'a' is already counted
            while(check != 0) {
                int b = check % 10;
                check = check / 10;
                if(a == b) {
                    flag = false;
                    break;
                }
            }

            // if not counted, count occurrences
            if(flag) {
                int count = 0;
                temp = n;  // reset temp to original number
                while(temp != 0) {
                    int c = temp % 10;
                    temp = temp / 10;
                    if(a == c)
                        count++;
                }
                System.out.println(a + " Occurs " + count);

                // mark this digit as counted
                i = i * 10 + a;
				temp=n;
            }
        }
    }
}
