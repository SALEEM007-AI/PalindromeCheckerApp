import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Input : ");
        String input = sc.nextLine();

        // Create object of service class
        PalindromeService service = new PalindromeService();

        // Call method to check palindrome
        boolean result = service.checkPalindrome(input);

        // Print result
        System.out.println("Is Palindrome? : " + result);

        sc.close();
    }
}

// Service class containing palindrome logic
class PalindromeService {

    public boolean checkPalindrome(String input) {

        // Initialize pointers
        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward
        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}