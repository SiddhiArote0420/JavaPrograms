import java.util.Scanner;

public class LongestSubstring{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        int maxLength = 0;
        String longest = "";

        for (int i = 0; i < str.length(); i++) {

            String temp = "";

            for (int j = i; j < str.length(); j++) {

                char ch = str.charAt(j);

                // Check duplicate manually
                boolean found = false;

                for (int k = 0; k < temp.length(); k++) {

                    if (temp.charAt(k) == ch) {
                        found = true;
                        break;
                    }
                }

                if (found) {
                    break;
                }

                temp = temp + ch;

                if (temp.length() > maxLength) {
                    maxLength = temp.length();
                    longest = temp;
                }
            }
        }

        System.out.println("Longest Substring : " + longest);
        System.out.println("Length : " + maxLength);
    }
}