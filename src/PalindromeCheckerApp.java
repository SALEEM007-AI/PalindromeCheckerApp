import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            Stack<Character> stack = new Stack<>();
            Queue<Character> queue = new LinkedList<>();

            // Insert characters into stack and queue
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                stack.push(ch);   // LIFO
                queue.add(ch);    // FIFO
            }

            boolean isPalindrome = true;

            // Compare elements
            while (!stack.isEmpty()) {
                char fromStack = stack.pop();
                char fromQueue = queue.remove();

                if (fromStack != fromQueue) {
                    isPalindrome = false;
                    break;
                }
            }

            // Display result
            if (isPalindrome) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not a Palindrome");
            }
            sc.close();
    }
}
