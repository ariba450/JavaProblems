import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String r = "";
        for (int i=str.length() - 1; i >= 0; i--) {
            r += str.charAt(i);
        }

        if (str.equals(r)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
