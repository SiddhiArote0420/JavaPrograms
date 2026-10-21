import java.util.Scanner;

public class PalindromLongString{

    // Check whether substring is palindrome
    public static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String s = sc.nextLine();

        String longest = "";

        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j <= s.length(); j++) {

                String sub = s.substring(i, j);

                if (isPalindrome(sub)) {

                    if (sub.length() > longest.length()) {
                        longest = sub;
                    }
                }
            }
        }

        System.out.println("Longest Palindrome : " + longest);
        System.out.println("Length : " + longest.length());
    }
}

//second way
/*import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String s = sc.nextLine();

        int start = 0;
        int maxLength = 1;

        for (int i = 0; i < s.length(); i++) {

            // Odd length palindrome
            int left = i;
            int right = i;

            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {

                if (right - left + 1 > maxLength) {
                    maxLength = right - left + 1;
                    start = left;
                }

                left--;
                right++;
            }

            // Even length palindrome
            left = i;
            right = i + 1;

            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {

                if (right - left + 1 > maxLength) {
                    maxLength = right - left + 1;
                    start = left;
                }

                left--;
                right++;
            }
        }

        System.out.println("Longest Palindrome : "
                + s.substring(start, start + maxLength));

        System.out.println("Length : " + maxLength);
    }
}*/
