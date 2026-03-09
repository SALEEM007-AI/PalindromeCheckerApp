import java.util.*;
public class PalindromeCheckerApp {
    public static boolean checkPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine();
        long startTime = System.nanoTime();
        boolean result = checkPalindrome(input);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println("Is Palindrome?: " + result);
        System.out.println("Execution Time : " + executionTime + " ns");
    }
}