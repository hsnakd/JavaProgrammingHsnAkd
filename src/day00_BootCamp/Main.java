package day00_BootCamp;
import java.util.Scanner;

class Main {
    public static String PalindromicSubstring(String str) {
        int currLen = 0, maxLen = 0;
        int n = str.length();
        String str1 = "";

        if (str.length() <= 2) {
            return str;
        }

        // Code for odd length palindrome
        for (int centerIndex = 1; centerIndex < n - 1; centerIndex++) {
            int leftIndex = centerIndex - 1, rightIndex = centerIndex + 1;

            while (leftIndex >= 0 && rightIndex < n && str.charAt(leftIndex) == str.charAt(rightIndex)) {
                leftIndex--;
                rightIndex++;
            }

            currLen = rightIndex - leftIndex - 1;
            if (currLen > maxLen) {
                maxLen = currLen;
                str1 = str.substring(leftIndex + 1, rightIndex);
            }
        }

        // Code for even length palindrome
        for (int centerIndex = 0; centerIndex < n - 1; centerIndex++) {
            int leftIndex = centerIndex, rightIndex = centerIndex + 1;

            while (leftIndex >= 0 && rightIndex < n && str.charAt(leftIndex) == str.charAt(rightIndex)) {
                leftIndex--;
                rightIndex++;
            }

            currLen = rightIndex - leftIndex - 1;
            if (currLen > maxLen) {
                maxLen = currLen;
                str1 = str.substring(leftIndex + 1, rightIndex);
            }
        }

        if (maxLen <= 2) {
            return "none";
        }
        str = str1;
        return str;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(PalindromicSubstring(s.nextLine()));
    }
}




