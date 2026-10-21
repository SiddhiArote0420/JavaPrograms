import java.util.*;

public class SKM {
    public static void main(String[] args) {
        int num = 1;      // for generating even numbers
        int cubeNum = 9;  // starting cube number

        for (int count = 0; count < 9; count++) {
            int even = num * 2;               // generate even number
            int cube = cubeNum * cubeNum * cubeNum; // generate cube

            System.out.print(even + "   " + cube + "   ");

            num++;      // next even number
            cubeNum--;  // next cube number (decreasing)
        }
    }
}
