import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user to enter input
        System.out.print("Input : ");
        String input = sc.nextLine();

        // Create LinkedList
        LinkedList<Character> list = new LinkedList<>();

        // Add characters to LinkedList
        for(char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;

        // Compare first and last characters
        while(list.size() > 1) {
            char first = list.removeFirst();
            char last = list.removeLast();

            if(first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        System.out.println("Is Palindrome? : " + isPalindrome);

        sc.close();
    }
}