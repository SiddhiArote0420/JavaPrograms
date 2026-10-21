/*
0111111110
0011111100
0001111000
0000110000
0000000000
*/

public class Pattern_47 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {

                if (j <= i || j > 10 - i) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }

            }
            System.out.println();
        }
    }
}
