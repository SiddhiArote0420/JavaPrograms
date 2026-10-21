import java.util.*;
public class Pattern {
    public static void main(String[] x) {
        int n = 3;

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {

                boolean flag = false;

                if ((i <= 4 && (i+i-1)<=j) || (i>4 && 15 -(i*2)<=j)){
                    // <-- looks like missing parentheses and logic fixes needed
                    flag = true;
                }

                if (!flag) {
                    if (i <= 4)
                        System.out.print(i);
                    else
                        System.out.print(n);
                    flag = true;
                } else {
                    System.out.print("*");
                    flag = false;
                }
            }

            if (i > 4)
                n--;

            System.out.println();
        }
    }
}
